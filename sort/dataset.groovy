print("生成数据集 随机10");
int  randDatasetLen=10;



def genDataset(Integer lens,String folder){
    Vector<Integer> dataset=new Vector<>(lens);
    int  randDatasetLen=lens
    Random seed = new Random(lens);
    println("生成数据集 随机"+lens);
    for (int i = 0; i <randDatasetLen ; i++) {
        dataset.add(seed.nextInt(lens));
    }
    FileWriter resFile=new FileWriter(folder+"/data"+lens+".data",false);
    PrintWriter file = new PrintWriter(resFile);
    file.print(dataset);
    file.close();
}

genDataset(100,"dataset")
genDataset(10000,"dataset")
genDataset(1000000,"dataset")