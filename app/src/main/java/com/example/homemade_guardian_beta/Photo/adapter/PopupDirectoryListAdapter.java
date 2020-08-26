package com.example.homemade_guardian_beta.Photo.adapter;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.homemade_guardian_beta.R;
import com.example.homemade_guardian_beta.Photo.entity.PhotoDirectory;

import java.util.ArrayList;
import java.util.List;

// PhotoPickerFragment에서 나타낸 하단부에 이미지들의 디렉토리를 고를 수 있다. 다른 경로의 이미지들을 선택할 수 있게 해준다.

public class PopupDirectoryListAdapter extends BaseAdapter {

  private Context context;

  private List<PhotoDirectory> directories = new ArrayList<>();

  private LayoutInflater mLayoutInflater;


  public PopupDirectoryListAdapter(Context context, List<PhotoDirectory> directories) {
    this.context = context;
    this.directories = directories;

    mLayoutInflater = LayoutInflater.from(context);
  }

  @Override public int getCount() {
    return directories.size();
  }

  @Override public PhotoDirectory getItem(int position) {
    return directories.get(position);
  }

  @Override public long getItemId(int position) {
    return directories.get(position).hashCode();
  }

  @Override public View getView(int position, View convertView, ViewGroup parent) {
    ViewHolder holder;
    if (convertView == null) {
      convertView = mLayoutInflater.inflate(R.layout.util_item_directory, parent, false);
      holder = new ViewHolder(convertView);
      convertView.setTag(holder);
    } else {
      holder = (ViewHolder) convertView.getTag();
    }
    holder.bindData(directories.get(position));

    return convertView;
  }

  private class ViewHolder {

    public ImageView ivCover;
    public TextView tvName;
    public TextView tvCount;

    public ViewHolder(View rootView) {
      ivCover = (ImageView) rootView.findViewById(R.id.iv_dir_cover);
      tvName  = (TextView)  rootView.findViewById(R.id.tv_dir_name);
      tvCount = (TextView)  rootView.findViewById(R.id.tv_dir_count);
    }

    public void bindData(PhotoDirectory directory) {
      if (context instanceof Activity && ((Activity) context).isFinishing()) {
        return;
      }
      Glide.with(context)
          .load(directory.getCoverPath())
          .thumbnail(0.1f)
          .into(ivCover);
      tvName.setText(directory.getName());
      Log.d("태그", "5"+directory.getName());
      tvCount.setText(context.getString(R.string.y_photopicker_image_count, directory.getPhotos().size()));
    }
  }
}