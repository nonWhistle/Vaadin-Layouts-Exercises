package com.example.application.views.exercise2;

import ch.qos.logback.core.Layout;
import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.ElementFactory;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Exercise 2")
@Route(value = "Exercise-2", layout = MainLayout.class)
public class Exercise2View extends VerticalLayout {

    public Exercise2View()
    {
        setPadding(false);
        setSpacing(false);

        /*
        Adds the first name and last name areas.
         */
        HorizontalLayout horizontalLayout = new HorizontalLayout();

        FormLayout formLayout = new FormLayout();

        TextField firstName = new TextField();
        formLayout.addFormItem(firstName, "First Name");
        firstName.setWidthFull();

        TextField lastname = new TextField();
        formLayout.addFormItem(lastname, "Last Name");
        lastname.setWidthFull();

        horizontalLayout.add(formLayout);
        horizontalLayout.setSizeFull();
        horizontalLayout.getStyle().set("background", "yellow");
        horizontalLayout.expand(formLayout);

        add(horizontalLayout);

        /*
        Adds the Email area.
         */
        HorizontalLayout emailHorizontalLayout = new HorizontalLayout();

        FormLayout emailFormLayout = new FormLayout();

        TextField email = new TextField();
        emailFormLayout.addFormItem(email, "Email").getElement().setAttribute("colspan", "2");
        email.setWidthFull();

        emailHorizontalLayout.add(emailFormLayout);
        emailHorizontalLayout.setSizeFull();
        emailHorizontalLayout.getStyle().set("background", "pink");
        emailHorizontalLayout.expand(emailFormLayout);

        add(emailHorizontalLayout);

        /*
        Adds the Phone area.
         */
        HorizontalLayout phoneHorizontalLayout = new HorizontalLayout();

        FormLayout phoneFormLayout = new FormLayout();

        FlexLayout flexPhone = new FlexLayout();
        flexPhone.setWidthFull();
        TextField phone = new TextField();
        Checkbox noCall = new Checkbox("Do Not Call");
        flexPhone.add(phone, noCall);
        flexPhone.expand(phone);
        flexPhone.setAlignItems(Alignment.CENTER);

        phoneFormLayout.addFormItem(flexPhone, "Phone").getElement().setAttribute("colspan", "2");

        phoneHorizontalLayout.add(phoneFormLayout);
        phoneHorizontalLayout.setSizeFull();
        phoneHorizontalLayout.getStyle().set("background", "yellow");
        phoneHorizontalLayout.expand(phoneFormLayout);

        add(phoneHorizontalLayout);

        /*
        Adds the password and retype password areas.
         */
        HorizontalLayout passwordHorizontalLayout = new HorizontalLayout();

        FormLayout passwordFormLayout = new FormLayout();

        PasswordField password = new PasswordField();
        passwordFormLayout.addFormItem(password, "Password");
        password.setWidthFull();

        passwordFormLayout.getElement().appendChild(ElementFactory.createBr());

        PasswordField retypePassword = new PasswordField();
        passwordFormLayout.addFormItem(retypePassword, "Retype-Password");
        retypePassword.setWidthFull();

        passwordHorizontalLayout.add(passwordFormLayout);
        passwordHorizontalLayout.setSizeFull();
        passwordHorizontalLayout.getStyle().set("background", "pink");
        passwordHorizontalLayout.expand(passwordFormLayout);

        add(passwordHorizontalLayout);
    }

}
