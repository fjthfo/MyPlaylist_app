//package com.example.myplaylist.adapter;
//
//import android.view.LayoutInflater;
//import android.view.ViewGroup;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.DiffUtil;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.android.dx.dex.file.Item;
//import com.example.myplaylist.databinding.LayoutItemBinding;
//
//import org.jetbrains.annotations.NotNull;
//
//import kotlin.jvm.internal.Intrinsics;
//
//public class Mainadapter extends RecyclerView.Adapter<Mainadapter.MyViewHolder> {
//
//    private com.example.myplaylist.model.Item Item0;
//
//
//    public final class MyViewHolder extends RecyclerView.ViewHolder {
//        private final LayoutItemBinding binding;
//
//        public void bind(@NotNull Item item) {
//            Intrinsics.checkNotNullParameter(item, "item");
//            this.binding.setItem(Item0);
//        }
//
//        public MyViewHolder(@NotNull LayoutItemBinding binding) {
//            Intrinsics.checkNotNullParameter(binding, "binding");
//            super(binding.getRoot());
//            this.binding = binding;
//        }
//    }
////    class MyViewHolder extends RecyclerView.ViewHolder{
////
////        private final LayoutItemBinding binding;
////
////        public MyViewHolder(@NonNull View itemView) {
////            super(itemView);
////            //이미 recycler_item.xml 모양으로 만들어진 itemView와 연결하는 바인딩클래스객체 연결하여 생성하기!
////            // [ recycler_item.xml  --->   RecyclerItemBinding  ]
////            binding= LayoutItemBinding.bind(itemView);
////        }
////
////        //아이템뷰 1개 안에 있는 자식뷰들에 전달받은 아이템의 값들을 연결하는 기능메소드
////        void bindItem(Item item){
////            //뷰 바인딩으로 이미 자식뷰들의 참조값들이 모두 연결되어 있음.
////            binding.item = item;
////        }
////    }
//
//
//
//
//    @NonNull
//    @Override
//    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        LayoutItemBinding binding = LayoutItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false)
//        return new MyViewHolder(binding);
//    }
//
//
//
//
//    @Override
//    public void onBindViewHolder(MyViewHolder holder, int position) {
//        holder.bindItem(Item0.get(position), position);
//    }
//
//    @Override
//    public int getItemCount() {
//        return Item0.size();
//    }
//
//    private static final DiffUtil diffUtil = (DiffUtil)(new DiffUtil() {
//        public boolean areItemsTheSame(@NotNull Item oldItem, @NotNull Item newItem) {
//            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
//            Intrinsics.checkNotNullParameter(newItem, "newItem");
//            return Intrinsics.areEqual(oldItem.getTitle(), newItem.getTitle());
//        }
//
//        // $FF: synthetic method
//        // $FF: bridge method
//
//        public boolean areContentsTheSame(@NotNull Item oldItem, @NotNull Item newItem) {
//            return oldItem.hashCode() == newItem.hashCode();
//        }
//
//    });
//
//
//}