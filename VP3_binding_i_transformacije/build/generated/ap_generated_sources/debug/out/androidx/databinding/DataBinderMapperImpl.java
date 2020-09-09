package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new info.androidhive.viewpager2.DataBinderMapperImpl());
  }
}
