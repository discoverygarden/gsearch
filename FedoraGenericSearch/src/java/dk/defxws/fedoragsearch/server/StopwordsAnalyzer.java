package dk.defxws.fedoragsearch.server;

import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.lucene.analysis.standard.StandardAnalyzer;

/**
 * Example of custom analyzer
 * assumes the file stopwords.txt to be in the classpath.
 */

public class StopwordsAnalyzer {
	
    public StopwordsAnalyzer() throws IOException {
    	new StandardAnalyzer(new InputStreamReader(StopwordsAnalyzer.class
    			.getResourceAsStream("/stopwords.txt")));
    }
}
