package ir.mft.mftfridaysbahman97;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TestAlertDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_alert_dialog);

        Button btnShowDialog = findViewById(R.id.btnShowDialog);

        btnShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog dialog = new AlertDialog.Builder(TestAlertDialogActivity.this).create();
                dialog.setTitle("Attention!");
                dialog.setMessage("Please consider reading this message");
                dialog.setButton(AlertDialog.BUTTON_POSITIVE, "Confirm", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(TestAlertDialogActivity.this, "Confirmed!", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });

                dialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(TestAlertDialogActivity.this, "Canceled!", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();

                    }
                });

                dialog.setButton(AlertDialog.BUTTON_NEUTRAL, "No Idea", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        Intent intent = new Intent(TestAlertDialogActivity.this, TestDialogActivity.class);
                        startActivity(intent);

                    }
                });


                dialog.show();

            }
        });


    }
}
