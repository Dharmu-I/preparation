package com.preparation.design.kingdom.core;

import com.preparation.design.kingdom.enums.Gender;

import java.util.List;

public interface KingsFamilyManager {

    String addChildToFamily(String motherName, String childName, Gender gender);

    void addSpouseDetails(String kingsRelationPersonName, String spouseName, Gender gender);

    List<String> getRelation(String name, String relationShip);
}
