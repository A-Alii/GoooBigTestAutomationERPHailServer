package Base;

import org.testng.annotations.DataProvider;


public class ProductsManagementTestProvider {

    @DataProvider(name = "unitDataProvider")
    public Object[][] unitDataProvider() {
        return new Object[][]{
                {"متر", "Meter", "المنتج يباع بالمتر"},
                {"كيلومتر", "Kilometer", "المنتج يباع بالكيلومتر"},
                {"سنتيمتر", "Centimeter", "المنتج يباع بالسنتيمتر"},
                {"ملم", "Millimeter", "المنتج يباع بالملم"},
                {"إنش", "Inch", "المنتج يباع بالإنش"},
                {"قدم", "Foot", "المنتج يباع بالقدم"},
                {"ياردة", "Yard", "المنتج يباع بالياردة"},
                {"متر مربع", "Square Meter", "المنتج يباع بالمتر المربع"},
                {"لتر", "Liter", "المنتج يباع باللتر"},
                {"غالون", "Gallon", "المنتج يباع بالغالون"},
                {"كيلوجرام", "Kilogram", "المنتج يباع بالكيلوجرام"},
                {"جرام", "Gram", "المنتج يباع بالجرام"},
                {"طن", "Ton", "المنتج يباع بالطن"},
                {"متر مكعب", "Cubic Meter", "المنتج يباع بالمتر المكعب"},
                {"بوصة", "Inch", "المنتج يباع بالبوصة"},
                {"كيلوواط", "Kilowatt", "المنتج يباع بالكيلوواط"},
                {"حصان", "Horsepower", "المنتج يباع بالحصان"},
                {"سنتيمتر مكعب", "Cubic Centimeter", "المنتج يباع بالسنتيمتر المكعب"},
                {"ميل", "Mile", "المنتج يباع بالميل"},
                {"ميكرو متر", "Micrometer", "المنتج يباع بالميكرو متر"}
        };
    }


    @DataProvider(name = "categoryDataProvider")
    public Object[][] categoryDataProvider() {
        return new Object[][]{
                {"إلكترونيات", "Piece", "المنتج يباع بالقطعة"},
                {"مواد غذائية", "Kilogram", "المنتج يباع بالكيلوجرام"},
                {"أثاث منزلي", "Set", "المنتج يباع بالمجموعة"},
                {"أدوات مكتبية", "Pack", "المنتج يباع بالعبوة"},
                {"مستلزمات رياضية", "Unit", "المنتج يباع بالوحدة"},
                {"أجهزة طبية", "Box", "المنتج يباع بالصندوق"},
                {"ألعاب أطفال", "Pair", "المنتج يباع بالزوج"},
                {"منتجات تجميل", "Bottle", "المنتج يباع بالزجاجة"},
                {"مستلزمات سفر", "Bag", "المنتج يباع بالحقيبة"},
                {"منتجات زراعية", "Ton", "المنتج يباع بالطن"},
                {"معدات صناعية", "Roll", "المنتج يباع باللفة"},
                {"أدوات كهربائية", "Meter", "المنتج يباع بالمتر"},
                {"مواد بناء", "Cubic Meter", "المنتج يباع بالمتر المكعب"},
                {"معدات مطبخ", "Piece", "المنتج يباع بالقطعة"},
                {"مستحضرات طبية", "Milliliter", "المنتج يباع بالمليلتر"},
                {"كتب ومجلات", "Copy", "المنتج يباع بالنسخة"},
                {"عطور", "Spray", "المنتج يباع بالبخاخ"},
                {"ملابس رياضية", "Set", "المنتج يباع بالمجموعة"},
                {"إطارات سيارات", "Piece", "المنتج يباع بالقطعة"},
                {"أدوات سباكة", "Pack", "المنتج يباع بالعبوة"},
        };
    }

    @DataProvider(name = "productDetailsDataProvider")
    public Object[][] productDetailsDataProvider() {
        return new Object[][]{
                {"Laptop", "A high-performance laptop with 16GB RAM and 512GB SSD.", true, null},
                {"Smartphone", "A smartphone with 64GB storage and a 12MP camera.", false, "Laptop"},
                {"Office Chair", "An ergonomic office chair with lumbar support.", true, null},
                {"Desk Lamp", "A stylish desk lamp with adjustable brightness.", false, "Office Chair"},
                {"Water Bottle", "A stainless steel water bottle with a 1-liter capacity.", true, null},
                {"Tennis Racket", "A lightweight tennis racket with a carbon fiber frame.", false, "Water Bottle"},
                {"Blender", "A 700W blender with multiple speed settings and a glass jar.", true, null},
                {"Backpack", "A durable backpack with multiple compartments and a laptop sleeve.", true, null},
                {"Running Shoes", "Lightweight running shoes with breathable mesh upper.", false, "Blender"},
                {"Electric Drill", "A cordless electric drill with a 20V battery and multiple drill bits.", true, null},
                {"Microwave Oven", "A 1200W microwave oven with grill function and digital display.", false, "Electric Drill"},
                {"Gaming Console", "A gaming console with 1TB storage and wireless controllers.", true, null},
                {"Yoga Mat", "A non-slip yoga mat with a 6mm thickness for extra comfort.", false, "Gaming Console"},
                {"Electric Kettle", "A 1.5-liter electric kettle with auto shut-off feature.", true, null},
                {"Tablet", "A 10-inch tablet with 128GB storage and a high-resolution display.", false, "Electric Kettle"},
                {"Wireless Headphones", "Noise-cancelling wireless headphones with a 20-hour battery life.", true, null},
                {"Coffee Maker", "A drip coffee maker with a programmable timer and 12-cup capacity.", false, "Wireless Headphones"},
                {"Camping Tent", "A waterproof camping tent for 4 people with easy setup.", true, null},
                {"Suitcase", "A hard-shell suitcase with a TSA lock and 360-degree spinner wheels.", false, "Camping Tent"},
                {"Digital Camera", "A digital camera with 24MP resolution and 4K video recording capability.", true, null},
        };
    }



}