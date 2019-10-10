package com.ayobami.justjava;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

    int quantity = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * this method increases the order quantity
     *
     * @param view
     */
    public void increaseQuantity(View view) {

        quantity = quantity + 1;

        display(quantity);
    }

    /**
     * this method decreases the order quantity
     *
     * @param view
     */

    public void decreaseQuantity(View view) {

        quantity = quantity - 1;
        display(quantity);

    }


    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price = quantity * 5;
        //displayPrice(quantity * 5);
        //String priceMessage = "That would be $" + (quantity * 5) + " Please" ;
        //String priceMessage = (quantity * 5) + " dollars for " + quantity + " cups of coffee" ;
        String priceMessage = "Total= $" + price;
        priceMessage = priceMessage + "\nThank you!";
        displayMessage(priceMessage);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

}
