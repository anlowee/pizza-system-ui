package com.iamwxc.pizzaui.panels;

import com.iamwxc.pizzaui.PizzaFrame;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/18
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/18
 */
public class OrderPizzaPanel extends JPanel {

    JLabel order = new JLabel("已点订单:Cheese, Dine");

    public OrderPizzaPanel(final PizzaFrame pizzaFrame) {
        super();
        JButton undo = new JButton("返回");
        undo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pizzaFrame.cardLayout.show(pizzaFrame.getContentPane(), pizzaFrame.STORE_CHOOSE_PANEL);
            }
        });
        add(undo);

        JRadioButton cheesePizzaBtn = new JRadioButton("芝士披萨", true);
        JRadioButton pepperoniPizzaBtn = new JRadioButton("香肠披萨");
        cheesePizzaBtn.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                pizzaFrame.type = "Cheese";
            }
        });
        pepperoniPizzaBtn.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                pizzaFrame.type = "Pepperoni";
            }
        });
        ButtonGroup pizzaTypes = new ButtonGroup();
        pizzaTypes.add(cheesePizzaBtn);
        pizzaTypes.add(pepperoniPizzaBtn);
        add(cheesePizzaBtn);
        add(pepperoniPizzaBtn);

        final JCheckBox largeSizeCheckBox = new JCheckBox("大份披萨");
        largeSizeCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (largeSizeCheckBox.isSelected()) {
                    pizzaFrame.additions.add("Large Size");
                } else {
                    int position = -1;
                    for (int i = 0; i < pizzaFrame.additions.size(); i++) {
                        String addition = pizzaFrame.additions.get(i);
                        if ("Large Size".equals(addition)) {
                            position = i;
                            break;
                        }
                    }
                    if (position != -1) {
                        pizzaFrame.additions.remove(position);
                    }
                }
            }
        });
        add(largeSizeCheckBox);

        JButton moreCheeseBtn = new JButton("多加芝士");
        moreCheeseBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pizzaFrame.additions.add("More Cheese");
            }
        });
        add(moreCheeseBtn);

        JButton lessCheeseBtn = new JButton("少加芝士");
        lessCheeseBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int position = -1;
                for (int i = 0; i < pizzaFrame.additions.size(); i++) {
                    String addition = pizzaFrame.additions.get(i);
                    if ("More Cheese".equals(addition)) {
                        position = i;
                        break;
                    }
                }
                if (position != -1) {
                    pizzaFrame.additions.remove(position);
                }
            }
        });
        add(lessCheeseBtn);

        JButton moreSauceBtn = new JButton("多加酱");
        moreSauceBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pizzaFrame.additions.add("More Sauce");
            }
        });
        add(moreSauceBtn);

        JButton lessSauceBtn = new JButton("少加酱");
        lessSauceBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int position = -1;
                for (int i = 0; i < pizzaFrame.additions.size(); i++) {
                    String addition = pizzaFrame.additions.get(i);
                    if ("More Sauce".equals(addition)) {
                        position = i;
                        break;
                    }
                }
                if (position != -1) {
                    pizzaFrame.additions.remove(position);
                }
            }
        });
        add(lessSauceBtn);

        JButton moreToppingsBtn = new JButton("多加酱料");
        moreToppingsBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pizzaFrame.additions.add("More Toppings");
            }
        });
        add(moreToppingsBtn);

        JButton lessToppingsBtn = new JButton("少加配料");
        lessToppingsBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int position = -1;
                for (int i = 0; i < pizzaFrame.additions.size(); i++) {
                    String addition = pizzaFrame.additions.get(i);
                    if ("More Toppings".equals(addition)) {
                        position = i;
                        break;
                    }
                }
                if (position != -1) {
                    pizzaFrame.additions.remove(position);
                }
            }
        });
        add(lessToppingsBtn);


//        // italy special
//        JButton morePepperoniBtn = new JButton("多加香肠");
//        morePepperoniBtn.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                pizzaFrame.additions.add("More Pepperoni");
//            }
//        });
//        morePepperoniBtn.setVisible("italy".equals(pizzaFrame.type));
//        add(morePepperoniBtn);
//        JButton lessPepperoniBtn = new JButton("少加香肠");
//        lessPepperoniBtn.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                int position = -1;
//                for (int i = 0; i < pizzaFrame.additions.size(); i++) {
//                    String addition = pizzaFrame.additions.get(i);
//                    if ("More Pepperoni".equals(addition)) {
//                        position = i;
//                        break;
//                    }
//                }
//                if (position != -1) {
//                    pizzaFrame.additions.remove(position);
//                }
//            }
//        });
//        lessPepperoniBtn.setVisible("italy".equals(pizzaFrame.type));
//        add(lessPepperoniBtn);

        final JCheckBox highTemperatureCheckBox = new JCheckBox("高温烘烤");
        highTemperatureCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (highTemperatureCheckBox.isSelected()) {
                    pizzaFrame.additions.add("High Temperature");
                } else {
                    int position = -1;
                    for (int i = 0; i < pizzaFrame.additions.size(); i++) {
                        String addition = pizzaFrame.additions.get(i);
                        if ("High Temperature".equals(addition)) {
                            position = i;
                            break;
                        }
                    }
                    if (position != -1) {
                        pizzaFrame.additions.remove(position);
                    }
                }
            }
        });
        add(highTemperatureCheckBox);
        final JCheckBox longTimeCheckBox = new JCheckBox("长时间烘烤");
        longTimeCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (longTimeCheckBox.isSelected()) {
                    pizzaFrame.additions.add("Long Time");
                } else {
                    int position = -1;
                    for (int i = 0; i < pizzaFrame.additions.size(); i++) {
                        String addition = pizzaFrame.additions.get(i);
                        if ("Long Time".equals(addition)) {
                            position = i;
                            break;
                        }
                    }
                    if (position != -1) {
                        pizzaFrame.additions.remove(position);
                    }
                }
            }
        });
        add(longTimeCheckBox);

        final JCheckBox tenSlicesCheckBox = new JCheckBox("切成十片");
        tenSlicesCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (tenSlicesCheckBox.isSelected()) {
                    pizzaFrame.additions.add("10 Slices");
                } else {
                    int position = -1;
                    for (int i = 0; i < pizzaFrame.additions.size(); i++) {
                        String addition = pizzaFrame.additions.get(i);
                        if ("10 Slices".equals(addition)) {
                            position = i;
                            break;
                        }
                    }
                    if (position != -1) {
                        pizzaFrame.additions.remove(position);
                    }
                }
            }
        });
        add(tenSlicesCheckBox);
        final JCheckBox twelveSlicesCheckBox = new JCheckBox("切成十二片");
        twelveSlicesCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (twelveSlicesCheckBox.isSelected()) {
                    pizzaFrame.additions.add("12 Slices");
                } else {
                    int position = -1;
                    for (int i = 0; i < pizzaFrame.additions.size(); i++) {
                        String addition = pizzaFrame.additions.get(i);
                        if ("12 Slices".equals(addition)) {
                            position = i;
                            break;
                        }
                    }
                    if (position != -1) {
                        pizzaFrame.additions.remove(position);
                    }
                }
            }
        });
        add(twelveSlicesCheckBox);

        final JRadioButton dineBtn = new JRadioButton("堂食", true);
        dineBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int position = -1;
                for (int i = 0; i < pizzaFrame.additions.size(); i++) {
                    String addition = pizzaFrame.additions.get(i);
                    if ("Dine".equals(addition)) {
                        position = i;
                        break;
                    }
                }
                if (position != -1) {
                    pizzaFrame.additions.remove(position);
                }
                if (dineBtn.isSelected()) {
                        pizzaFrame.additions.add("Dine");
                }
            }
        });
        final JRadioButton takeOutBtn = new JRadioButton("外带");
        takeOutBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int position = -1;
                for (int i = 0; i < pizzaFrame.additions.size(); i++) {
                    String addition = pizzaFrame.additions.get(i);
                    if ("Take Out".equals(addition)) {
                        position = i;
                        break;
                    }
                }
                if (position != -1) {
                    pizzaFrame.additions.remove(position);
                }
                if (takeOutBtn.isSelected()) {
                    pizzaFrame.additions.add("Take Out");
                }
            }
        });
        ButtonGroup dineOrTakeOut = new ButtonGroup();
        dineOrTakeOut.add(dineBtn);
        dineOrTakeOut.add(takeOutBtn);
        add(dineBtn);
        add(takeOutBtn);

        add(order);
    }

    private String listToString(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder("已点订单:");
        for (String string : strings) {
            stringBuilder.append(string).append(", ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length());
        return stringBuilder.toString();
    }

}
