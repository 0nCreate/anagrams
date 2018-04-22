package hwr.com.hwreverse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnTextChanged;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.etInput)
    EditText editText;
    @BindView(R.id.tvResult)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse);
        ButterKnife.bind(this);
    }

    @OnTextChanged(R.id.etInput)
    public void onTextChanged (CharSequence s) {
        textView.setText(Anagrams.reverseIgnoreNotLiteral(s.toString()));
    }

}
