package com.example.v9t1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.NoteViewHolder> {
    private ArrayList<Note> notes;

    public NoteAdapter(ArrayList<Note> notes) {
        this.notes = notes;
    }

    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_note, parent, false);
        return new NoteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteViewHolder holder, int position) {
        Note note = notes.get(position);

        holder.NoteIdText.setText(String.valueOf(note.getId()));
        holder.NoteTimeAndDateText.setText(note.getTimeAndDate());
        holder.NoteTitleText.setText(note.getTitle());
        holder.NoteContentText.setText(note.getContent());
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    public static class NoteViewHolder extends RecyclerView.ViewHolder {
        TextView NoteIdText;
        TextView NoteTimeAndDateText;
        TextView NoteTitleText;
        TextView NoteContentText;

        public NoteViewHolder(@NonNull View itemView) {
            super(itemView);

            NoteIdText = itemView.findViewById(R.id.NoteIdText);
            NoteTimeAndDateText = itemView.findViewById(R.id.NoteTimeAndDateText);
            NoteTitleText = itemView.findViewById(R.id.NoteTitleText);
            NoteContentText = itemView.findViewById(R.id.NoteContentText);
        }
    }
}
