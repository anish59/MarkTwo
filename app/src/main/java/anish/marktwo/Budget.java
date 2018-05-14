package anish.marktwo;


import android.database.sqlite.SQLiteDatabase;

import com.google.auto.value.AutoValue;
import com.squareup.sqldelight.RowMapper;

import anish.marktwo.dataBaseHelper.DataBaseManger;
import anish.marktwo.model.BudgetRequest;

/**
 * Created by anish on 03-07-2017.
 */

@AutoValue
public abstract class Budget implements BudgetModel {
    public static final Factory<Budget> FACTORY = new Factory<>(AutoValue_Budget::new);
    public static final RowMapper<Budget> MAPPER = FACTORY.select_all_budgetMapper();

    public static void insert(BudgetRequest budgetRequest) {
        SQLiteDatabase sqLiteDatabase = DataBaseManger.getInstance().openDatabase();
//        sqLiteDatabase.insert(Budget.TABLE_NAME,null,Budget.FACTORY.marshal())
        Budget.Insert_In_Budget insert=new Insert_In_Budget(sqLiteDatabase);
        insert.bind(budgetRequest.month(),budgetRequest.amount());
//        insert.

    }

}
