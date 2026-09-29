import android.content.SharedPreferences;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;

public class LoginActivity  extends AppCompatActivity {

    EditText email, senha;
    Button entrar, novo;

    CheckBox box;

    SharedPreferences preferences;

    public static final  String PREF_NAME = "login";

    public static final  String KEY_EMAIL = "email";

    public static final  String KEY_SENHA = "senha";

    public static final  String REMEMBER = "remember";

    public class LoginActivity extends AppCompatActivity {

        public class LoginActivity extends AppCompatActivity {
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);

                entrar.setOnClickListener(new View.OnClickListener() {
                    public class LoginActivity extends AppCompatActivity {
                        @Override
                        protected void onCreate(Bundle savedInstanceState) {
                            super.onCreate(savedInstanceState);

                            entrar.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if (validarDados()) {
                                        SharedPreferences preferences = getSharedPreferences(name: "dados", MODE_PRIVATE);
                                        String emailCadastrado = preferences.getString(key: "email", defaultValue: "Deu ruim");
                                        String senhaCadastrada = preferences.getString(key: "senha", defaultValue: "Deu ruim");

                                        String emailDigitado = email.getText().toString();
                                        String senhaDigitada = senha.getText().toString();

                                        if (emailDigitado.equals(emailCadastrado) && senhaDigitada.equals(senhaCadastrada)) {
                                            // Se der sucesso no login, grava a data do login
                                            String data = new SimpleDateFormat(pattern: "dd/MM/yyyy HH:mm:ss", Locale.getDefault()).format(new Date());

                                            SharedPreferences.Editor dados = preferences.edit();

                                            if (lembrar.isChecked()) {
                                                dados.putBoolean(key: "remember", true);
                                            } else {
                                                dados.putBoolean(key: "remember", false);
                                            }

                                            dados.putString(key: "data", data);
                                            dados.apply();

                                            Toast.makeText(LoginActivity.this, text: "Login Efetuado", Toast.LENGTH_SHORT).show();

                                            // Ir para a tela principal
                                            Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                                            startActivity(intent);
                                            finish();
                                        } else {
                                            Toast.makeText(LoginActivity.this, text: "Email ou Senha incorretos", Toast.LENGTH_SHORT).show();
                                        }
                                    } else {
                                        Toast.makeText(LoginActivity.this, text: "Digite todos os dados", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });

                            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                                return insets;
                            });

                            cadastrar.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                                    startActivity(intent);
                                }
                            });
                        }

                        private void inipomponentes() {
                            email = findViewById(R.id.edit_email);
                        }
                    }