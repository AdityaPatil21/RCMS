package com.algorithm;
import java.io.FileReader;
import java.io.IOException;
import weka.classifiers.Evaluation;
import weka.classifiers.trees.RandomForest;
import weka.core.Instances;
import weka.core.converters.ArffLoader;
import weka.core.converters.CSVLoader;

public class RandomForestClassifier {
	
		public static String TRAINING_DATA_SET_FILENAME="C:\\Users\\poras\\OneDrive\\Desktop\\BE final project\\Workspace\\RoadComplaintMgmt\\WebContent\\Dataset\\features0";
		
		
		public static Instances getDataSet(String fileName) throws IOException {
			
			int classIdx = 1;
			
			CSVLoader loader=new CSVLoader();
		
			loader.setSource(RandomForestClassifier.class.getResourceAsStream("/" + fileName));
			
			Instances dataSet = loader.getDataSet();
			
			dataSet.setClassIndex(classIdx);
			return dataSet;
		}

		public static void process() throws Exception {

			Instances data = getDataSet(TRAINING_DATA_SET_FILENAME);
			//Instances testingDataSet = getDataSet(TESTING_DATA_SET_FILENAME);
	
			RandomForest forest=new RandomForest();
			forest.setNumTrees(10);
			
			forest.buildClassifier(data);
			
			Evaluation eval = new Evaluation(data);
		
			
			eval.toSummaryString();
			eval.toMatrixString();
			eval.toClassDetailsString();
			
		}
}
