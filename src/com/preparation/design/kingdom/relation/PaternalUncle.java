package com.preparation.design.kingdom.relation;

        import com.preparation.design.kingdom.Util.RelationUtils;
        import com.preparation.design.kingdom.core.KingsFamilyPerson;
        import com.preparation.design.kingdom.enums.Gender;

        import java.util.*;

public class PaternalUncle implements Relation {

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
                        Collections.singletonList(Gender.Male));
            }
            kingsFamilyPeople.addAll(kingsFamilyPerson.getKids());
        }
        return Collections.emptyList();
    }
}
