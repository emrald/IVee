package com.androidtutorialpoint.horizontallistview;

/**
 * Created by anonymous on 11/4/16.
 */

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class HorizontalListViewFragment extends Fragment {

    ArrayList<Fruit> listitems = new ArrayList<>();
    ArrayList<Fruit> listitemsfav = new ArrayList<>();
    RecyclerView MyRecyclerView, MyRecyclerView1, MyRecyclerView2, MyRecyclerView3,
            MyRecyclerView4, MyRecyclerView5, MyRecyclerView6, cardViewFav;
    String Fruits[] = {"Furniture Assembly", "Interior Design", "TV Mounting", "Interior Painting", "Packing and Unpacking", "Carpet Cleaning", "House Cleaning"};
    int Images[] = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.j};
    LinearLayout llmain;
    TextView tvlogin,tvsavedfav;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listitems.clear();
        for (int i = 0; i < Fruits.length; i++) {
            Fruit item = new Fruit();
            item.setCardName(Fruits[i]);
            item.setImageResourceId(Images[i]);
            item.setIsfav(0);
            item.setIsturned(0);
            listitems.add(item);
        }
        getActivity().setTitle("Fruit List");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_horizontal_list_view, container, false);

        llmain = (LinearLayout)view.findViewById(R.id.llmain);
        tvlogin = (TextView)view.findViewById(R.id.tvlogin);
        llmain.setNestedScrollingEnabled(true);

        MyRecyclerView = (RecyclerView) view.findViewById(R.id.cardView11);
        MyRecyclerView1 = (RecyclerView) view.findViewById(R.id.cardView22);
        MyRecyclerView2 = (RecyclerView) view.findViewById(R.id.cardView33);
        MyRecyclerView3 = (RecyclerView) view.findViewById(R.id.cardView44);
        MyRecyclerView4 = (RecyclerView) view.findViewById(R.id.cardView55);
        MyRecyclerView5 = (RecyclerView) view.findViewById(R.id.cardView66);
        MyRecyclerView6 = (RecyclerView) view.findViewById(R.id.cardView77);

        cardViewFav = (RecyclerView)view.findViewById(R.id.cardViewFav);

        tvsavedfav = (TextView)view.findViewById(R.id.tvsavedfav);
        if(listitemsfav.size()>0)
            tvsavedfav.setVisibility(View.VISIBLE);
        else
            tvsavedfav.setVisibility(View.GONE);

        //   MyRecyclerView.setHasFixedSize(true);
        //  MyRecyclerView1.setHasFixedSize(true);
        LinearLayoutManager MyLayoutManager = new LinearLayoutManager(getActivity());
        MyLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        if (listitems.size() > 0 & MyRecyclerView != null) {
            MyRecyclerView.setAdapter(new MyAdapter(listitems));
        }
        MyRecyclerView.setLayoutManager(MyLayoutManager);

        LinearLayoutManager MyLayoutManager1 = new LinearLayoutManager(getActivity());
        MyLayoutManager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        if (listitems.size() > 0 & MyRecyclerView1 != null) {
            MyRecyclerView1.setAdapter(new MyAdapter(listitems));
        }
        MyRecyclerView1.setLayoutManager(MyLayoutManager1);

        LinearLayoutManager MyLayoutManager2 = new LinearLayoutManager(getActivity());
        MyLayoutManager2.setOrientation(LinearLayoutManager.HORIZONTAL);
        if (listitems.size() > 0 & MyRecyclerView2 != null) {
            MyRecyclerView2.setAdapter(new MyAdapter(listitems));
        }
        MyRecyclerView2.setLayoutManager(MyLayoutManager2);

        LinearLayoutManager MyLayoutManager3 = new LinearLayoutManager(getActivity());
        MyLayoutManager3.setOrientation(LinearLayoutManager.HORIZONTAL);
        if (listitems.size() > 0 & MyRecyclerView3 != null) {
            MyRecyclerView3.setAdapter(new MyAdapter(listitems));
        }
        MyRecyclerView3.setLayoutManager(MyLayoutManager3);

        LinearLayoutManager MyLayoutManager4 = new LinearLayoutManager(getActivity());
        MyLayoutManager4.setOrientation(LinearLayoutManager.HORIZONTAL);
        if (listitems.size() > 0 & MyRecyclerView4 != null) {
            MyRecyclerView4.setAdapter(new MyAdapter(listitems));
        }
        MyRecyclerView4.setLayoutManager(MyLayoutManager4);

        LinearLayoutManager MyLayoutManager5 = new LinearLayoutManager(getActivity());
        MyLayoutManager5.setOrientation(LinearLayoutManager.HORIZONTAL);
        if (listitems.size() > 0 & MyRecyclerView5 != null) {
            MyRecyclerView5.setAdapter(new MyAdapter(listitems));
        }
        MyRecyclerView5.setLayoutManager(MyLayoutManager5);

        LinearLayoutManager MyLayoutManager6 = new LinearLayoutManager(getActivity());
        MyLayoutManager6.setOrientation(LinearLayoutManager.HORIZONTAL);
        if (listitems.size() > 0 & MyRecyclerView6 != null) {
            MyRecyclerView6.setAdapter(new MyAdapter(listitems));
        }
        MyRecyclerView6.setLayoutManager(MyLayoutManager6);

        /*LinearLayoutManager MyLayoutManagerFav = new LinearLayoutManager(getActivity());
        MyLayoutManagerFav.setOrientation(LinearLayoutManager.HORIZONTAL);
        Log.e("SIZE...",listitemsfav.size()+":SIZE");
        if (listitemsfav.size() > 0 & cardViewFav != null) {
            cardViewFav.setAdapter(new MyAdapterFav(listitemsfav));
        }
        cardViewFav.setLayoutManager(MyLayoutManagerFav);*/

       /* MyRecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int itemPosition = MyRecyclerView.getChildLayoutPosition(view);
                String item = listitems.get(itemPosition).getCardName()+"";
                Toast.makeText(getActivity(), item, Toast.LENGTH_LONG).show();
            }
        });*/

       /* LinearLayoutManager MyLayoutManager7 = new LinearLayoutManager(getActivity());
        MyLayoutManager7.setOrientation(LinearLayoutManager.HORIZONTAL);
        if (listitems.size() > 0 & MyRecyclerView7 != null) {
            MyRecyclerView7.setAdapter(new MyAdapter(listitems));
        }
        MyRecyclerView7.setLayoutManager(MyLayoutManager7);*/
        tvlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              /*  Dialog dialog = new Dialog(getContext());
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.activity_login);
                dialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);*/
               /* WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
                lp.copyFrom(dialog.getWindow().getAttributes());
                lp.width = WindowManager.LayoutParams.MATCH_PARENT;
                lp.height = WindowManager.LayoutParams.MATCH_PARENT;
                dialog.show();
                dialog.getWindow().setAttributes(lp);*/
              /*  AlertDialog.Builder adb = new AlertDialog.Builder(getContext());
                Dialog d = adb.setView(new View(getContext())).create();
                // (That new View is just there to have something inside the dialog that can grow big enough to cover the whole screen.)

                WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
                lp.copyFrom(d.getWindow().getAttributes());
                lp.width = WindowManager.LayoutParams.MATCH_PARENT;
                lp.height = WindowManager.LayoutParams.MATCH_PARENT;
                d.show();
                d.getWindow().setAttributes(lp);*/
               // dialog.show();
                /*Intent intent = new Intent(getActivity(),LoginActivity.class);
                startActivity(intent);
                getActivity().finish();*/
                final Dialog customDialog;
                LayoutInflater inflater = (LayoutInflater) getActivity().getLayoutInflater();
                View customView = inflater.inflate(R.layout.activity_login, null);
               // WindowManager.LayoutParams.FLAG_BLUR_BEHIND;
// Build the dialog
                customDialog = new Dialog(getActivity(), R.style.CustomDialog);
                customDialog.setContentView(customView);

                ImageView imgback = (ImageView)customDialog.findViewById(R.id.imgback);
                imgback.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        customDialog.dismiss();
                    }
                });
                customDialog.show();
            }
        });
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
        private ArrayList<Fruit> list;

        public MyAdapter(ArrayList<Fruit> Data) {
            list = Data;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            // create a new view
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.recycle_items, parent, false);
            MyViewHolder holder = new MyViewHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(final MyViewHolder holder, final int position) {
            Log.e("AAAAAAAAA",list.get(position).getCardName()+"");
            holder.titleTextView.setText(list.get(position).getCardName());
            holder.coverImageView.setImageResource(list.get(position).getImageResourceId());
            holder.coverImageView.setTag(list.get(position).getImageResourceId());
            holder.coverImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                   /* Intent intent = new Intent(getActivity(),DetailsActivity.class);
                    intent.putExtra("category_name","Where do you need the\n "+list.get(position).getCardName()+"?");
                    startActivity(intent);*/

                    Fruit e = new Fruit();
                    e.setCardName(list.get(position).getCardName());
                    e.setImageResourceId(list.get(position).getImageResourceId());
                    e.setIsfav(1);
                    e.setIsturned(1);
                    listitemsfav.add(e);
                    notifyDataSetChanged();

                    LinearLayoutManager MyLayoutManagerFav = new LinearLayoutManager(getActivity());
                    MyLayoutManagerFav.setOrientation(LinearLayoutManager.HORIZONTAL);
                    Log.e("SIZE...",listitemsfav.size()+":SIZE");
                    if (listitemsfav.size() > 0 & cardViewFav != null) {
                        tvsavedfav.setVisibility(View.VISIBLE);
                        cardViewFav.setAdapter(new MyAdapterFav(listitemsfav));
                    }
                    cardViewFav.setLayoutManager(MyLayoutManagerFav);

                 //   Toast.makeText(getActivity(), list.get(position).getCardName(), Toast.LENGTH_SHORT).show();
                }
            });
                   holder.imageView.setTag(R.drawable.like);
        }

        @Override
        public int getItemCount() {
            return list.size();
        }
    }
    public class MyAdapterFav extends RecyclerView.Adapter<MyViewHolder> {
        private ArrayList<Fruit> list;

        public MyAdapterFav(ArrayList<Fruit> Data) {
            list = Data;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            // create a new view
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.favorite_items, parent, false);
            MyViewHolder holder = new MyViewHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(final MyViewHolder holder, final int position) {
            Log.e("AAAAAAAAA",list.get(position).getCardName()+"");
            holder.titleTextView.setText(list.get(position).getCardName());
            holder.coverImageView.setImageResource(list.get(position).getImageResourceId());
            holder.coverImageView.setTag(list.get(position).getImageResourceId());
            holder.coverImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(),DetailsActivity.class);
                    intent.putExtra("category_name","Where do you need the\n "+list.get(position).getCardName()+"?");
                    startActivity(intent);
                    //   Toast.makeText(getActivity(), list.get(position).getCardName(), Toast.LENGTH_SHORT).show();
                }
            });
                  holder.imageView.setTag(R.drawable.unfav);
        }

        @Override
        public int getItemCount() {
            return list.size();
        }
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView titleTextView;
        public ImageView coverImageView;
        public ImageView imageView;
      /*  public ImageView likeImageView;
        public ImageView shareImageView;*/

        public MyViewHolder(View v) {
            super(v);
            titleTextView = (TextView) v.findViewById(R.id.titleTextView);
            coverImageView = (ImageView) v.findViewById(R.id.coverImageView);
            imageView = (ImageView)v.findViewById(R.id.imageView);
            /*likeImageView = (ImageView) v.findViewById(R.id.likeImageView);
            shareImageView = (ImageView) v.findViewById(R.id.shareImageView);*/
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int id = (int)imageView.getTag();
                    if( id == R.drawable.unfav){

                        imageView.setTag(R.drawable.like);
                        imageView.setImageResource(R.drawable.like);

                        Toast.makeText(getActivity(),titleTextView.getText()+" added to favourites",Toast.LENGTH_SHORT).show();
                    }else{

                   //     listitemsfav.remove(0);
                 //       notify();

                        imageView.setTag(R.drawable.unfav);
                        imageView.setImageResource(R.drawable.unfav);

                        Toast.makeText(getActivity(),titleTextView.getText()+" removed from favourites",Toast.LENGTH_SHORT).show();
                    }

                }
            });

           /* shareImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri imageUri = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE +
                            "://" + getResources().getResourcePackageName(coverImageView.getId())
                            + '/' + "drawable" + '/' + getResources().getResourceEntryName((int)coverImageView.getTag()));


                    Intent shareIntent = new Intent();
                    shareIntent.setAction(Intent.ACTION_SEND);
                    shareIntent.putExtra(Intent.EXTRA_STREAM,imageUri);
                    shareIntent.setType("image/jpeg");
                    startActivity(Intent.createChooser(shareIntent, getResources().getText(R.string.send_to)));



                }
            });

*/

        }
    }
}