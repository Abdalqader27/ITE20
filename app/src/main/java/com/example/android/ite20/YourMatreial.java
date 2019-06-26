package com.example.android.ite20;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class YourMatreial extends AppCompatActivity {
    private ExpandableListView listView;
    private Expandable_ListView_Adapter_forYourMaterial adapter;
    private List<String> list_dataHeader;
    private HashMap<String, List<String>> listHash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_matreial);
        listView = (ExpandableListView) findViewById(R.id.listExpandable);
        initData();
        adapter = new Expandable_ListView_Adapter_forYourMaterial(this, list_dataHeader, listHash);
        listView.setAdapter(adapter);
    }

    private void initData() {
        list_dataHeader = new ArrayList<>();
        listHash = new HashMap<>();
        list_dataHeader.add("المادة الأولى: التحليل 3");
        list_dataHeader.add("المادة الثانية: البرمجة 3");
        list_dataHeader.add("المادة الثالثة: التحليل العددي 1 ");
        list_dataHeader.add(" المادة الرابعة: الاحتمالات ");
        list_dataHeader.add(" المادة الخامسة: البرمجة الرياضية");
        list_dataHeader.add("المادة السادسة: الالكترونيات ");
        list_dataHeader.add("المادة السابعة: اللغة الأجنبية 3 (تخصصية)");

        List<String> M1 = new ArrayList<>();
        M1.add("دكتور المادة: د. مريم سعيد\n" +
                "تهدف هذه المادة الى تعريف الطالب بالمعادلات التفاضلية و مرتبتها و درجتها وحلولها إضافة إلى بعض مفاهيم التحليل الشعاعي. كما يتعرف الطالب على مفهوم المعادلات التكاملية و تحويلات لابلاس و تطبيقاتها الهندسية.\n");

        List<String> M2 = new ArrayList<>();
        M2.add("دكتور المادة: د. محمد الحميد (د. زينب شواً سابقاً)\n" +
                "تهدف هذه المادة إلى تصميم البرمجة غرضية التوجه وذلك بلغة الجافا الشهيرة، إضافةً إلى أساسيات النموذج غرضي التوجه، ومفاهيم الغرض و الصفوف وحماية المعطيات وتغليفها والعلاقات بين الصفوف الوراثة و التجميع والتوابع الافتراضية الصفوف المجردة و الواجهات Interfaces، وبعض التطبيقات العملية حول الواجهات الرسومية GUI وكيفية التعامل معها.\n");

        List<String> M3 = new ArrayList<>();
        M3.add("دكتور المادة: د. مريم سعيد\n" +
                "تهدف هذه المادة الى تعريف الطالب بأساسيات التحليل العددي و مفاهيمه إضافةً إلى استخدام الطرق العددية في حل جمل معادلات خطية كما يتعرف الطالب على طرق الاستيفاء و الطرق العددية في حساب الاشتقاق أو التكامل، إضافةً إلى تحليل الانحدار الخطي واللاخطي لنموذج المعادلات من الدرجة الثانية.");

        List<String> M4 = new ArrayList<>();
        M4.add("دكتور المادة: د. شذى زبيدة\n" +
                "تهدف هذه المادة إلى تعريف الطالب بالمبادئ الأساسية في علم الاحتمالات إضافة إلى المتحولات العشوائية و تطبيقها. كما يتعرف الطالب على بعض التوزيعات الاحتمالية الشهيرة، كالتوزيع الطبيعي وتوزيع بواسون.\n");

        List<String> M5 = new ArrayList<>();
        M5.add("دكتور المادة: د. زينب شوا (د. شذى زبيدة سابقاً)\n" +
                "تهدف هذه المادة الى تعليم الطالب مفهوم البرمجة الرياضية و التركيز بشكل خاص على البرمجة الرياضية الخطية حيث يتعلم الطالب من خلال هذه المادة كيفية تمثيل مسألة ما يراد حلها ببرنامج رياضي ملائم، ثم حل هذا البرنامج بالطرق الرياضية المناسبة. كما يتعرف الطالب من خلالها على بعض تطبيقات البرمجة الخطية، والطريقة الجبرية (سمبلكس) في إيجاد الحل الأمثل للبرامج الخطية. ");

        List<String> M6 = new ArrayList<>();
        M6.add("دكتور المادة: د. ياسر اسطنبلي (د. عارف نعمة ود. أمجد البابا سابقاً)\n" +
                "يهدف المقرر لتأسيس الطالب بمبادئ الهندسة الالكترونية ابتداءً من مبدأ عمل أنواع الديود و الترانزستور والمضخات الترانزستورية و مضخم العمليات و تطبيقاته. يقدم المقرر دراسة عن مولدات الإشارة و الاستجابة العابرة. أما فصل الدارات الالكترونية الرقمية فيقدم معلومات غنية عن الدارات المتكاملة الرقمية وعلاقاتها المنطقية. يدرس الطالب أيضاً مدخل لتحصيل الإشارات التماثلية من وإلى الحاسوب. عملياً، يتم العمل على مجموعة من الدارات الالكترونية وذلك على برنامج Multisim المحاكي للدارات الالكترونية والكهربائية، إذ يتم العمل على الدارات الجسرية ودارات الترشيح والتنعيم والقص والعديد من الدارات الأخرى.");
        List<String> M7 = new ArrayList<>();
        M7.add("المادة ستقوم بتعريف الطالب بالمصطلحات العلمية و الحاسوبية بشكل خاص و ذلك من خلال دراسة مقالات علمية متخصصة في مجال الحاسوب.");

        listHash.put(list_dataHeader.get(0), M1);
        listHash.put(list_dataHeader.get(1), M2);
        listHash.put(list_dataHeader.get(2), M3);
        listHash.put(list_dataHeader.get(3), M4);
        listHash.put(list_dataHeader.get(4), M5);
        listHash.put(list_dataHeader.get(5), M6);
        listHash.put(list_dataHeader.get(6), M7);


    }
}
