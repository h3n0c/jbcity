package main.scala.sim.network

class NetworkRailway extends Network with EmploymentsNetwork {
  constructionCost = 2000 
  destructionCost = 1500
  constructionTime = 50
  energy = 100
  water = 100
  
  numEmployment = 50
  override def getname():String = "---"
}