package com.preparation.design.kingdom.relation;

import com.preparation.design.kingdom.enums.Gender;
import com.preparation.design.kingdom.core.KingsFamilyPerson;
import com.preparation.design.kingdom.Util.RelationUtils;

import java.util.*;

public class PaternalAunt implements Relation {

    private Siblings siblings = new Siblings();

    @Override
    public List<String> getRelationDetails(String name) {
        List<KingsFamilyPerson> kingsFamilyPeople = RelationUtils.getKingsFamilyTreeAndKingsRelationList(name);
        while (!kingsFamilyPeople.isEmpty()) {
            KingsFamilyPerson kingsFamilyPerson = kingsFamilyPeople.remove(0);
            List<String> kidsList = RelationUtils.getKidsNames(kingsFamilyPerson.getKids(), name,
                    Arrays.asList(Gender.values()));
            if (kidsList.contains(name) && kingsFamilyPerson.getFather() != null) {
                return siblings.getSiblings(kingsFamilyPerson.getFather().getName(),
                        Collections.singletonList(Gender.Female));
            }
            kingsFamilyPeople.addAll(kingsFamilyPerson.getKids());
        }
        return Collections.emptyList();
    }
}
