package com.preparation.design.kingdom.relation;

import com.preparation.design.kingdom.Util.RelationUtils;
import com.preparation.design.kingdom.core.KingsFamilyPerson;
import com.preparation.design.kingdom.enums.RelationOfKing;

import java.util.*;

public class Son implements Relation {
    @Override
    public List<String> getRelationDetails(String name) {
        List<KingsFamilyPerson> kingsFamilyPeople = RelationUtils.getKingsFamilyTreeAndKingsRelationList(name);
        while (!kingsFamilyPeople.isEmpty()){
            KingsFamilyPerson kingsFamilyPerson = kingsFamilyPeople.remove(0);
            if (( kingsFamilyPerson.getFather()!= null && name.equalsIgnoreCase(kingsFamilyPerson.getFather().getName()))
                    || (kingsFamilyPerson.getMother() != null && name.equalsIgnoreCase(kingsFamilyPerson.getMother().getName()))){
                return getSonsNames(kingsFamilyPerson.getKids());
            }
            kingsFamilyPeople.addAll(kingsFamilyPerson.getKids());
        }

        return Collections.emptyList();
    }

    private List<String> getSonsNames(List<KingsFamilyPerson> kingsFamilyPersonList){
        List<String> sonsNames = new ArrayList<>();
        for(KingsFamilyPerson kingsFamilyPerson:kingsFamilyPersonList){
            if (kingsFamilyPerson.getRelationOfKing().equals(RelationOfKing.Father)){
                sonsNames.add(kingsFamilyPerson.getFather().getName());
            }
        }
        return sonsNames;
    }

}
