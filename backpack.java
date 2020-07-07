import java.util.ArrayList;
import java.util.List;

public class PlayerObject {
    public static void main(String[] args) {
        List<Item> backpack = new ArrayList<>();

        Item boots = new Item()
            .setName("Leather Boots")
            .setPrice(100.);
        backpack.add(boots);

        Item rock = new Rock()
            .setName("The Legendary Dumbasa Rock")
            .setPrice(0.);
        backpack.add(rock);

        Item longsword = new Sword()
            .setName("Giant Sword of DOOOOMMMMM")
            .setPrice(1000000.)
            .setDamage(9001);
        backpack.add(longsword);

        for (Item i : backpack) {
            System.out.println(i + "\n");
        };
    }
}


class Item {
    String name;
    double price;

    public Item setName(String nameIn) {
        this.name = nameIn;
        return this;
    }

    public Item setPrice(double priceIn) {
        this.price = priceIn;
        return this;
    }

    @Override
    public String toString(){
        return (String.format("Name: %s\nCost: %s", this.name, this.price));
    }
}

abstract class Weapon extends Item {
    int weaponDamage;

    public Weapon setName(String nameIn) {
        super.setName(nameIn);
        return this;
    }

    public Weapon setPrice(double priceIn) {
        super.setPrice(priceIn);
        return this;
    }

    public Weapon setDamage(int damageIn) {
        this.weaponDamage = damageIn;
        return this;
    }

    @Override
    public String toString(){
        return (String.format("Name: %s\nCost: %s\nDamage: %d", this.name, this.price, this.weaponDamage));
    }
}

class Rock extends Item {
    @Override
    public String toString(){
        return (super.toString() + "\nIt's a rock, it was free.");
    }
}

class Sword extends Weapon {}
