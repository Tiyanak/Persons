package hr.fer.ruazosa.lecture1;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends Activity {

    public static final String INTENT_PARAMETER_PERSON = "person";
    private EditText editFirstName;
    private EditText editLastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        editFirstName = (EditText) findViewById(R.id.edit_first_name);
        editLastName = (EditText) findViewById(R.id.edit_last_name);

        Intent intent = getIntent();
        Person person = (Person) intent.getSerializableExtra(INTENT_PARAMETER_PERSON);

        editFirstName.setText(person.getFirstName());
        editLastName.setText(person.getLastName());
    }

    public void returnData(View view){
        Intent intent = new Intent();

        Person person = new Person();
        person.setFirstName(editFirstName.getText().toString());
        person.setLastName(editLastName.getText().toString());

        intent.putExtra(INTENT_PARAMETER_PERSON, person);
        setResult(RESULT_OK, intent);
        finish();
    }

    private void setSupportActionBar(Toolbar toolbar) {

    }


}
