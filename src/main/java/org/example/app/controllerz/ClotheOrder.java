package org.example.app.controllerz;

import org.example.app.interfacez.IItem;
import org.example.app.item.Clothes;
import org.example.app.model.ReadModel;
import org.example.app.view.ViewItem;

import java.util.List;

public class ClotheOrder implements IItem {

    ReadModel readModel = new ReadModel();

    @Override
    public void name() {
        List<Clothes> clothesList = readModel.ReadData();
        String tmp = ViewItem.choiceName();
        clothesList.stream().filter(tShirt -> tShirt.getName().startsWith(tmp)).
                forEach(item -> System.out.println(item.getName() + " " +
                        item.getManufacturer() + " " +
                        item.getColor() + " " +
                        item.getSize() + " " +
                        item.getPrice()
                ));
    }

    @Override
    public void manufacturer() {
        List<Clothes> clothesList = readModel.ReadData();
        String tmp = ViewItem.choiceManufacturer();
                clothesList.stream().filter(item -> item.getManufacturer().startsWith(tmp)).
                        forEach(item -> System.out.println(item.getName() + " " +
                                item.getManufacturer() + " " +
                                item.getColor() + " " +
                                item.getSize() + " " +
                                item.getPrice()
                        ));
    }

    @Override
    public void color() {
        List<Clothes> clothesList = readModel.ReadData();
        String tmp = ViewItem.choiceColor();
                clothesList.stream().filter(item -> item.getColor().startsWith(tmp)).
                        forEach(item -> System.out.println(item.getName() + " " +
                                item.getManufacturer() + " " +
                                item.getColor() + " " +
                                item.getSize() + " " +
                                item.getPrice()
                        ));
    }

    @Override
    public void size() {
        List<Clothes> clothesList = readModel.ReadData();
        String tmp = ViewItem.choiceSize();
                clothesList.stream().filter(item -> item.getSize().startsWith(tmp)).
                        forEach(item -> System.out.println(item.getName() + " " +
                                item.getManufacturer() + " " +
                                item.getColor() + " " +
                                item.getSize() + " " +
                                item.getPrice()
                        ));
    }

    @Override
    public void price() {
        List<Clothes> clothesList = readModel.ReadData();
        double tmp = ViewItem.choicePrice();
                clothesList.stream().filter(item -> item.getPrice() == tmp).
                        forEach(item -> System.out.println(item.getName() + " " +
                                item.getManufacturer() + " " +
                                item.getColor() + " " +
                                item.getSize() + " " +
                                item.getPrice()
                        ));
    }
}
