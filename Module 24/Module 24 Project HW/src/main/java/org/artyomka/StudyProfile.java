package org.artyomka;

public enum StudyProfile {
    MEDICINE("Medicine"),
    MATHEMATICS("Mathematics"),
    PHYSICS("Physics"),
    PHYSIOLOGY("Physiology"),
    ENGINEERING("Engineering");

    private String profileName;

    StudyProfile(String profileName){
        this.profileName = profileName;
    }

    public String getProfileName() {
        return profileName;
    }

    @Override
    public String toString() {
        return profileName;
    }
}
