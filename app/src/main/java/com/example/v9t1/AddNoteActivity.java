package com.example.v9t1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddNoteActivity extends AppCompatActivity {

    EditText TitleEdit;
    EditText ContentEdit;
    Button AddNoteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        TitleEdit = findViewById(R.id.TitleEdit);
        ContentEdit = findViewById(R.id.ContentEdit);
        AddNoteButton = findViewById(R.id.AddNoteButton);

        AddNoteButton.setOnClickListener(v -> {
            String title = TitleEdit.getText().toString();
            String content = ContentEdit.getText().toString();
            Note note = new Note(title, content);
            NoteStorage.getInstance().addNote(note);
        });
    }
}