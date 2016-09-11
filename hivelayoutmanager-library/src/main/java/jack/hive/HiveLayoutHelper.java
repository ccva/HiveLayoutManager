package jack.hive;

import android.support.annotation.IntDef;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by zjchai on 16/9/10.
 */
public abstract class HiveLayoutHelper {

    public static final int HORIZONTAL = 0 ;

    public static final int VERTICAL = 1;

    @IntDef({HORIZONTAL,VERTICAL})
    public @interface Orientation{}

    RecyclerView.LayoutManager mLayoutManager ;

    public HiveLayoutHelper(RecyclerView.LayoutManager layoutManager) {
        mLayoutManager = layoutManager;
    }


    public static HiveLayoutHelper getInstance(RecyclerView.LayoutManager layoutManager){
        return new HiveLayoutHelper(layoutManager){

            @Override
            public void getChildBounds(int position) {

            }
        } ;
    }

    public abstract void getChildBounds(int position);




}
