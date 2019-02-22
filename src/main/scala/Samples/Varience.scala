package Samples

class Grandparent
class Parent extends Grandparent
class Child extends Parent

class InvariantClass[A]
class CovariantClass[+A]
class ContravariantClass[-A]

class VarianceExamples {

  def invarMethod(x: InvariantClass[Parent]) {}

 // invarMethod(new InvariantClass[Child])             // ERROR - won't compile
  invarMethod(new InvariantClass[Parent])            // success
//  invarMethod(new InvariantClass[Grandparent])       // ERROR - won't compile

  def covarMethod(x: CovariantClass[Parent]) {}
  covarMethod(new CovariantClass[Child])             // success
  covarMethod(new CovariantClass[Parent])            // success
 // covarMethod(new CovariantClass[Grandparent])       // ERROR - won't compile

  def contraMethod(x: ContravariantClass[Parent]) {}
//  contraMethod(new ContravariantClass[Child])        // ERROR - won't compile
  contraMethod(new ContravariantClass[Parent])       // success
  contraMethod(new ContravariantClass[Grandparent])  // success
}