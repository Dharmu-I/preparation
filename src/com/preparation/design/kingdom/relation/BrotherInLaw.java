package com.preparation.design.kingdom.relation;

import com.preparation.design.kingdom.enums.Gender;
import com.preparation.design.kingdom.core.KingsFamilyPerson;
import com.preparation.design.kingdom.Util.RelationUtils;

import java.util.*;

public class BrotherInLaw implements Relation {

    private Siblings siblings = new Siblings();

    @Override
    public List<String> getRelationDetails(String name) {
        List<KingsFamilyPerson> kingsFamilyPeople = RelationUtils.getKingsFamilyTreeAndKingsRelationList(name);
        List<String> brotherInLaw = new ArrayList<>();
        while (!kingsFamilyPeople.isEmpty()) {
            KingsFamilyPerson kingsFamilyPerson = kingsFamilyPeople.remove(0);
            List<String> kidsName = RelationUtils.getKidsNames(kingsFamilyPerson.getKids(), name,
                    Arrays.asList(Gender.values()));
            if (kidsName.contains(name)) {
                brotherInLaw.addAll(siblings.getSiblings(name, Collections.singletonList(Gender.Male)));
                brotherInLaw.addAll(RelationUtils.getSpouse(kingsFamilyPerson.getKids(), name, Gender.Male));
                return brotherInLaw;
            }
            kingsFamilyPeople.addAll(kingsFamilyPerson.getKids());
        }
        return brotherInLaw;
    }
}
