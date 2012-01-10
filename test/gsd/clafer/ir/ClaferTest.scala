/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gsd.clafer.ir

import org.junit._
import Assert._
import scalaxb._
import org.scalatest.junit.JUnitSuite

class ClaferTest extends JUnitSuite {
    def main(args: Array[String]) {
      println("Hello, world!")
    }

    @Test
    def testClafer = {
      val subject = <Module xmlns="http://gsd.uwaterloo.ca/clafer"
                                xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                                xmlns:cl="http://gsd.uwaterloo.ca/clafer">
                          <Name>Test</Name>
                          <Declaration xsi:type="cl:IClafer">
                            <IsAbstract>false</IsAbstract>
                            <GroupCard>
                              <IsKeyword>False</IsKeyword>
                              <Interval>
                                <Min>
                                  <IntLiteral>0</IntLiteral>
                                </Min>
                                <Max xsi:type="cl:ExIntegerAst"/>
                              </Interval>
                            </GroupCard>
                            <Id>A</Id>
                            <UniqueId>c1_A</UniqueId>
                            <Supers>
                              <IsOverlapping>False</IsOverlapping>
                              <Super>
                                <Type xsi:type="ISet"/>
                                <!-- no parent identifier -->
                                <Exp xsi:type="IClaferId">
                                  <!-- no module name -->
                                  <Id>clafer</Id>
                                  <IsTop>false</IsTop>
                                </Exp>
                              </Super>
                            </Supers>
                            <Card>
                              <Min>
                                <IntLiteral>1</IntLiteral>
                              </Min>
                              <Max xsi:type="cl:ExIntegerNum">
                                <IntLiteral>1</IntLiteral>
                              </Max>
                            </Card>
                            <GlobalCard>
                              <Min>
                                <IntLiteral>1</IntLiteral>
                              </Min>
                              <Max xsi:type="cl:ExIntegerNum">
                                <IntLiteral>1</IntLiteral>
                              </Max>
                            </GlobalCard>
                          <Declaration xsi:type="cl:IConstraint">
                            <IsHard>false</IsHard>
                            <ParentExp>
                              <Type xsi:type="IBoolean"/>
                              <ParentId>c2_exp</ParentId>
                              <Exp xsi:type="cl:IFunctionExp">
                                <Operation>=</Operation>
                                <Argument>
                                  <Type xsi:type="INumeric">
                                     <NumericSubtype xsi:type="IInteger"/>
                                  </Type>
                                  <ParentId>c3_exp</ParentId>
                                  <Exp xsi:type="cl:IFunctionExp">
                                     <Operation>+</Operation>
                                     <Argument>
                                       <Type xsi:type="INumeric">
                                          <NumericSubtype xsi:type="IInteger"/>
                                       </Type>
                                       <ParentId>c4_exp</ParentId>
                                       <Exp xsi:type="IIntExp">
                                          <IntLiteral>2</IntLiteral>
                                       </Exp>
                                     </Argument>
                                     <Argument>
                                       <Type xsi:type="INumeric">
                                          <NumericSubtype xsi:type="IInteger"/>
                                       </Type>
                                       <ParentId>c5_exp</ParentId>
                                       <Exp xsi:type="IIntExp">
                                          <IntLiteral>2</IntLiteral>
                                       </Exp>
                                     </Argument>
                                  </Exp>
                                </Argument>
                                <Argument>
                                   <Type xsi:type="INumeric">
                                      <NumericSubtype xsi:type="IInteger"/>
                                   </Type>
                                   <ParentId>c6_exp</ParentId>
                                   <Exp xsi:type="IIntExp">
                                      <IntLiteral>4</IntLiteral>
                                   </Exp>
                                 </Argument>
                              </Exp>
                            </ParentExp>
                          </Declaration>
                       </Declaration>
                    </Module>
      try {
        val x = fromXML[IModule](subject)
        System.out.println(x)
        assert(true)
      } catch {
        case e:Exception =>
          e.printStackTrace()
          assert(false)
      }
    }
}
