package davidfoale.info.android_pass_object_to_activity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {

    Button btnPassObject;
    EditText etName, etAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPassObject = (Button) findViewById(R.id.btnPassObject);
        etName = (EditText) findViewById(R.id.etName);
        etAge = (EditText) findViewById(R.id.etAge);

        btnPassObject.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        // 1. create an intent pass class name or intnet action name
        Intent intent = new Intent(MainActivity.this,AnotherActivity.class);

        // 2. create person object
        Person person = new Person();
        person.setName(etName.getText().toString());
        person.setAge(Integer.parseInt(etAge.getText().toString()));

        // 3. put person in intent data
        intent.putExtra("person", person);

        // 4. start the activity
        startActivity(intent);
    }

}
