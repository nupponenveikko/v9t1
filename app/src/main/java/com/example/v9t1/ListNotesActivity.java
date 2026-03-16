package com.example.v9t1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
public class ListNotesActivity extends AppCompatActivity {
    RecyclerView ListNotesRV;
    Button BackButton;
    NoteAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_notes);

        ListNotesRV = findViewById(R.id.ListNotesRV);
        BackButton = findViewById(R.id.BackButton);

        ListNotesRV.setLayoutManager(new LinearLayoutManager(this));
        adapter = new NoteAdapter(NoteStorage.getInstance().getNotes());
        ListNotesRV.setAdapter(adapter);

        BackButton.setOnClickListener(v -> {
            Intent intent = new Intent(ListNotesActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
    @Override
    protected void onResume() {
        super.onResume();
        adapter.notifyDataSetChanged();
    }
}
