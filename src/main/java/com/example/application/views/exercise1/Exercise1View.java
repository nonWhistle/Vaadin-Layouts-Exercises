package com.example.application.views.exercise1;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.*;

@PageTitle("Exercise 1")
@Route(value = "Exercise-1", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class Exercise1View extends VerticalLayout {

    private final HorizontalLayout layout;
    private Div navigation;
    private Div content;

    public Exercise1View() 
    {
        setSizeFull();
        setPadding(false);
        setSpacing(false);
        setDefaultHorizontalComponentAlignment(Alignment.STRETCH);
        Image img = new Image("https://upload.wikimedia.org/wikipedia/en/d/d9/Logoplaste_logo.svg", "Error");
        img.setWidth("600px");

        final Div header = new Div();
        header.addClassNames("header");
        header.setText("This is the header, 150 pixels top - bottom");
        header.setHeight("150px");
        header.getStyle().set("flexShrink", "0");
        header.getStyle().set("background", "blue");
        header.add(img);

        layout = new HorizontalLayout();
        layout.setHeightFull();
        layout.setSpacing(false);
        createTextLayout();

        final Div footer = new Div();
        footer.addClassNames("footer");
        footer.setText("This is the footer, 100 pixels top - bottom");
        footer.setHeight("100px");
        footer.getStyle().set("flexShrink", "0");
        footer.getStyle().set("background", "red");

        add(header, layout, footer);

        expand(layout);

    }

    private void createTextLayout()
    {
        navigation = new Div();
        navigation.addClassNames("navigation");
        navigation.setWidth("25%");
        navigation.getElement().getStyle().set("flex-shrink", "0");
        navigation.setText("This is the navigation menu, My width is 25% of the app layout");
        navigation.getStyle().set("background", "green");
        DatePicker date = new DatePicker();
        navigation.add(date);

        content = new Div();
        content.addClassNames("content");
        content.setHeightFull();
        content.getStyle().set("display", "flex");
        content.setText("This is the content menu");
        content.getStyle().set("alignContent", "start");
        content.getStyle().set("background", "yellow");

        layout.add(navigation, content);
        layout.expand(content);
        layout.setDefaultVerticalComponentAlignment(Alignment.STRETCH);
    }
}