package myairlines.sorter_pack;

import myairlines.aircraft.Plane;

import java.util.Comparator;

public enum PlaneSortCriterions implements Comparator<Plane> {

    BY_TYPE {
        @Override
        public int compare(Plane o1, Plane o2) {
            if(o1 == null || o2 == null) {
                System.err.println("Объект должен быть проинициализирован");
                return -1;
            }
            return o1.getProducer().compareTo(o2.getProducer());
        }
    },
    BY_NAME {
        @Override
        public int compare(Plane o1, Plane o2) {
            if(o1 == null || o2 == null) {
                System.err.println("Объект должен быть проинициализирован");
                return -1;
            }
            return o1.getName().compareTo(o2.getName());
        }
    }, BY_FLIGHT_RANGE {
        @Override
        public int compare(Plane o1, Plane o2) {
            if(o1 == null || o2 == null) {
                System.err.println("Объект должен быть проинициализирован");
                return -1;
            }
            return o1.getFlightRange() > o2.getFlightRange() ? 1 : -1;
        }
    }, BY_FUEL_COMSUMPTION {
        @Override
        public int compare(Plane o1, Plane o2) {
            if(o1 == null || o2 == null) {
                System.err.println("Объект должен быть проинициализирован");
                return -1;
            }
            return Integer.valueOf((int)o1.getFuelConsumption(10.0)).compareTo((int) o2.getFuelConsumption(10.0));
        }
    }, BY_CAPACITY {
        @Override
        public int compare(Plane o1, Plane o2) {
            if(o1 == null || o2 == null) {
                System.err.println("Объект должен быть проинициализирован");
                return -1;
            }
            return Integer.valueOf(o1.getMaxCapacity()).compareTo(o2.getMaxCapacity());
        }
    }
}