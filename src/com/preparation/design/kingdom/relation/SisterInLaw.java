package com.preparation.design.kingdom.relation;

import com.preparation.design.kingdom.enums.Gender;
import com.preparation.design.kingdom.core.KingsFamilyPerson;
import com.preparation.design.kingdom.Util.RelationUtils;

import java.util.*;

public class SisterInLaw implements Relation {

    private Siblings siblings = new Siblings();

    @Override
    public List<String> getRelationDetails(String name) {
        List<KingsFamilyPerson> kingsFamilyPeople = RelationUtils.getKingsFamilyTreeAndKingsRelationList(name);
        List<String> sisterInLaw = new ArrayList<>();
        while (!kingsFamilyPeople.isEmpty()) {
            KingsFamilyPerson kingsFamilyPerson = kingsFamilyPeople.remove(0);
            List<String> kidsName = RelationUtils.getKidsNames(kingsFamilyPerson.getKids(), name,
                    Arrays.asList(Gender.values()));
            if (kidsName.contains(name)) {
                sisterInLaw.addAll(siblings.getSiblings(name, Collections.singletonList(Gender.Female)));
                sisterInLaw.addAll(RelationUtils.getSpouse(kingsFamilyPerson.getKids(), name, Gender.Female));
                return sisterInLaw;
            }
            kingsFamilyPeople.addAll(kingsFamilyPerson.getKids());
        }
        return sisterInLaw;
    }
}
