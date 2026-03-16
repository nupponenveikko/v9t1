package com.example.v9t1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
public class AddNoteActivity extends AppCompatActivity {
    EditText TitleEdit;
    EditText ContentEdit;
    Button AddNoteButton;
    Button BackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        TitleEdit = findViewById(R.id.TitleEdit);
        ContentEdit = findViewById(R.id.ContentEdit);
        AddNoteButton = findViewById(R.id.AddNoteButton);
        BackButton = findViewById(R.id.BackButton);

        AddNoteButton.setOnClickListener(v -> {
            String title = TitleEdit.getText().toString().trim();
            String content = ContentEdit.getText().toString().trim();
            Note note = new Note(title, content);
            NoteStorage.getInstance().addNote(note);
            TitleEdit.setText("");
            ContentEdit.setText("");
        });
        BackButton.setOnClickListener(v -> {
            Intent intent = new Intent(AddNoteActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
