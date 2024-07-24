package br.edu.ifsuldeminas.mch.gridview;
import android.os.Bundle;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.gridView);

        // Criar uma lista de itens
        List<Item> items = new ArrayList<>();
        items.add(new Item(R.drawable.batman, "Batman"));
        items.add(new Item(R.drawable.flash, "Flash"));
        items.add(new Item(R.drawable.homemaranha, "Homem-Aranha"));
        items.add(new Item(R.drawable.homemferro, "Homem-Ferro"));
        items.add(new Item(R.drawable.capitao, "Capitão América"));


        // Criar o adaptador e definir no GridView
        CustomAdapter adapter = new CustomAdapter(this, items);
        gridView.setAdapter(adapter);
    }
}
