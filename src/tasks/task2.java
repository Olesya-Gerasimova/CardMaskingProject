package tasks;

class Flat {
    String address;
    int floor;
    int numberOfRooms;
    double area;
    Room[] rooms;

    public Flat(String address, int floor, int numberOfRooms, double area, Room[] rooms) {
        this.address = address;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
        this.area = area;
        this.rooms = rooms;
    }
}

class Room {
    String type;
    double area;

    public Room(String type, double area) {
        this.type = type;
        this.area = area;
    }
}

public class task2 {
    public static void main(String[] args) {
        Room livingRoom = new Room("Гостиная", 20.5);
        Room bedroom = new Room("Спальня", 15.0);
        Room kitchen = new Room("Кухня", 10.0);

        Room[] rooms = { livingRoom, bedroom, kitchen };
        Flat flat = new Flat("ул. Примерная, 10", 3, 3, 65.5, rooms);

        System.out.println("Квартира по адресу: " + flat.address);
        System.out.println("Этаж: " + flat.floor);
        System.out.println("Количество комнат: " + flat.numberOfRooms);
        System.out.println("Общая площадь: " + flat.area + " кв.м");

        for (Room room : flat.rooms) {
            System.out.println("Комната: " + room.type + ", Площадь: " + room.area + " кв.м");
        }
    }
}
