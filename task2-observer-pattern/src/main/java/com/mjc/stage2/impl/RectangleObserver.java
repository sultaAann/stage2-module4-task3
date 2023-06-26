package com.mjc.stage2.impl;

import com.mjc.stage2.Observer;
import com.mjc.stage2.entity.Rectangle;
import com.mjc.stage2.entity.RectangleValues;
import com.mjc.stage2.event.RectangleEvent;
import com.mjc.stage2.warehouse.RectangleWarehouse;

public class RectangleObserver implements Observer {
    @Override
    public void handleEvent(RectangleEvent event) {
        RectangleWarehouse warehouse = RectangleWarehouse.getInstance();
        Rectangle rectangle = event.getSource();

        RectangleValues rectangleValues = warehouse.get(rectangle.getId());

        rectangleValues.setSquare(rectangle.getSideA() * rectangle.getSideB());
        rectangleValues.setPerimeter((rectangle.getSideA() + rectangle.getSideB()) * 2);
        warehouse.put(rectangle.getId(), rectangleValues);
    }
    // Write your code here!
}
