package com.example.visualphysics5;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.visualphysics5.databinding.ItemLessonsBinding;

import java.util.List;

public class LessonsAdapter extends RecyclerView.Adapter<LessonsAdapter.ViewHolder> {

    private final List<Lesson> data;

    public List<Lesson> getData() {
        return data;
    }

    public LessonsAdapter(List<Lesson> data) {
        this.data = data;
    }

    @SuppressLint("NotifyDataSetChanged")
    public void addItem(Lesson lesson){
        data.add(lesson);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new ViewHolder(
                ItemLessonsBinding.inflate(LayoutInflater.from(parent.getContext())).getRoot()
        );
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private final ItemLessonsBinding binding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ItemLessonsBinding.bind(itemView);
        }

        public void bind(@NonNull Lesson lesson){
            binding.title.setText(lesson.getTitle());
            binding.description.setText(lesson.getTitle());
        }
    }
}
