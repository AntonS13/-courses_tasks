package sorter;

import aircraft.Airplane;

import java.util.Comparator;

public enum AirplaneSortCriterions implements Comparator<Airplane> {

    BY_PRODUCER {
        @Override
        public int compare(Airplane o1, Airplane o2) {
            if(o1 == null || o2 == null) {
                System.err.println("Object <Plane> might been initialized!");
                return -1;
            }
            return o1.getProducer().compareTo(o2.getProducer());
        }
    },
    BY_NAME {
        @Override
        public int compare(Airplane o1, Airplane o2) {
            if(o1 == null || o2 == null) {
                System.err.println("Object <Plane> might been initialized!");
                return -1;
            }
            return o1.getName().compareTo(o2.getName());
        }
    }, BY_FLIGHT_RANGE {
        @Override
        public int compare(Airplane o1, Airplane o2) {
            if(o1 == null || o2 == null) {
                System.err.println("Object <Plane> might been initialized!");
                return -1;
            }
            return o1.getFlghtRange() > o2.getFlghtRange() ? 1 : -1;
        }
    }, BY_FUEL_COMSUMPTION {
        @Override
        public int compare(Airplane o1, Airplane o2) {
            if(o1 == null || o2 == null) {
                System.err.println("Object <Plane> might been initialized!");
                return -1;
            }
            return Integer.valueOf((int)o1.getFuelConsumption()).compareTo((int) o2.getFuelConsumption());
        }
    }, BY_CAPACITY {
        @Override
        public int compare(Airplane o1, Airplane o2) {
            if(o1 == null || o2 == null) {
                System.err.println("Object <Plane> might been initialized!");
                return -1;
            }
            return Integer.valueOf(o1.getMaxCapacity()).compareTo(o2.getMaxCapacity());
        }
    }
}