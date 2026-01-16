package com.day04.hospitalqueue;

class PatientSorter {

    public void sortByCriticality(Patient[] patients) {
        int size = patients.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (patients[j].getCriticalityLevel() <
                    patients[j + 1].getCriticalityLevel()) {

                    Patient temp = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;
                }
            }
        }
    }
}