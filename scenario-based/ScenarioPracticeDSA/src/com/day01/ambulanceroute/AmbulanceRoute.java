package com.day01.ambulanceroute;

class AmbulanceRoute {
    private HospitalUnit current;  // Points to current position in circle
    private int totalUnits;

    public AmbulanceRoute() {
        current = null;
        totalUnits = 0;
    }

    // Add unit to circular list
    public void addUnit(String name, boolean available) {
        HospitalUnit newUnit = new HospitalUnit(name, available);

        if (current == null) {
            current = newUnit;
            newUnit.next = newUnit; 
        } else {
            // Insert after current
            newUnit.next = current.next;
            current.next = newUnit;
        }
        totalUnits++;
        System.out.println("→ Added unit: " + name);
    }

    // Find next available unit starting from current position
    public String findNearestAvailable() {
        if (totalUnits == 0) {
            return "No units available in the hospital!";
        }

        HospitalUnit start = current;
        HospitalUnit temp = current;

        do {
            if (temp.available) {
                current = temp; // Update current position
                return temp.name + " (AVAILABLE)";
            }
            temp = temp.next;
        } while (temp != start);

        return "No available unit found in the entire hospital!";
    }

    // Move to next unit (manual rotation)
    public void rotateToNext() {
        if (current != null) {
            current = current.next;
            System.out.println("→ Rotated to: " + current.name);
        }
    }

    // Set unit availability
    public void setAvailability(String name, boolean status) {
        if (current == null) return;

        HospitalUnit temp = current;
        do {
            if (temp.name.equalsIgnoreCase(name)) {
                temp.available = status;
                System.out.println("→ " + name + " is now " + (status ? "AVAILABLE" : "UNAVAILABLE"));
                return;
            }
            temp = temp.next;
        } while (temp != current);

        System.out.println("Unit " + name + " not found!");
    }

    // Remove unit (maintenance / closed permanently)
    public boolean removeUnit(String name) {
        if (current == null) return false;

        HospitalUnit prev = null;
        HospitalUnit temp = current;

        // Special case: only one unit
        if (temp.next == temp && temp.name.equalsIgnoreCase(name)) {
            current = null;
            totalUnits--;
            System.out.println("→ Removed last unit: " + name);
            return true;
        }

        do {
            prev = temp;
            temp = temp.next;

            if (temp.name.equalsIgnoreCase(name)) {
                prev.next = temp.next;

                // If we removed the current unit, move current forward
                if (temp == current) {
                    current = temp.next;
                }

                totalUnits--;
                System.out.println("→ Removed unit (maintenance): " + name);
                return true;
            }
        } while (temp != current);

        System.out.println("Unit " + name + " not found!");
        return false;
    }

    // Show current status
    public void showStatus() {
        if (current == null) {
            System.out.println("No units in hospital right now.");
            return;
        }

        System.out.println("\nCurrent hospital circle status:");
        HospitalUnit temp = current;
        do {
            System.out.printf("  %s : %s\n", 
                temp.name, 
                temp.available ? "AVAILABLE" : "BUSY/MAINTENANCE");
            temp = temp.next;
        } while (temp != current);
    }
}