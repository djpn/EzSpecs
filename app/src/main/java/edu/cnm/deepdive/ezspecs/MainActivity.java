package edu.cnm.deepdive.ezspecs;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import edu.cnm.deepdive.ezspecs.model.database.EzDataBase;
import edu.cnm.deepdive.ezspecs.model.entity.Game;
import edu.cnm.deepdive.ezspecs.viewmodel.GameViewModel;

public class MainActivity extends AppCompatActivity {

  private Button fortnite;
//  private ArrayAdapter<Game> adapter;
//  private Spinner spinner;
//  private Context context;
//  public static MainActivity newInstance(){
//    return new MainActivity();
//  }
//

//
//
//
 @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    final GameViewModel viewModel = ViewModelProviders.of(this).get(GameViewModel.class);
    fortnite = (Button) findViewById(R.id.fortnitebutton);
    fortnite.setText("Fortnite");
  /*  final Spinner spinner = findViewById(R.id.spinner);
    viewModel.getGames().observe(this, (games) -> {
      adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, games);
      spinner.setAdapter(adapter);
    });*/
//
//    // fortnite.setOnClickListener(new OnClickListener() {
//
//  }
     /* @Override
      public void onClick(View v) {
        openTargetGameActivity();
      }
    });
  }
  *//*private void openTargetGameActivity(){
    Intent intent = new Intent(this, TargetGameActivity.class);
    startActivity(intent);
  }*/
//  }
//
//  @Override
//  public View onCreateView(String name, Context context, AttributeSet attrs) {
//    return super.onCreateView(name, context, attrs);
//  }
}
