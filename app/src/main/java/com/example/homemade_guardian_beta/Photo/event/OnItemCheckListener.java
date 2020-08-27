package com.example.homemade_guardian_beta.Photo.event;

import com.example.homemade_guardian_beta.Photo.entity.Photo;

// 이미지들이 나열되어 있는 PhotoPickerFragment와 연결되어 있는 PhotoGridAdapter에서 사진들이 체크되었을 때 발생하는 이벤트를 interface로 선언한 것이다.

public interface OnItemCheckListener {
  /***
   *
   * @param position Select Image postion
   * @param path     Select image path
   *@param isCheck   Image status
   * @param selectedItemCount  Select image count
   * @return enable check
   */
  boolean OnItemCheck(int position, Photo path, boolean isCheck, int selectedItemCount);
}
