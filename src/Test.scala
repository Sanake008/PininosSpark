import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD

object Test {
  def main(args: Array[String])
  {
    val conf:SparkConf = new SparkConf().setAppName("Histogram").setMaster("local")
		val sc:SparkContext = new SparkContext(conf)
		
    val rdd = sc.parallelize(0 to 5)
    
    println("tamaño del rdd: " + rdd.count() + " El numero de particiones: " + rdd.getNumPartitions)
    rdd.collect().foreach(println)
    
    println("Esto es solo una linea que cambiara el destino del repositorio")
    
  }
}