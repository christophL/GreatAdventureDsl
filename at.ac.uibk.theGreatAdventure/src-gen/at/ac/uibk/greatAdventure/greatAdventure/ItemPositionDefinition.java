/**
 */
package at.ac.uibk.greatAdventure.greatAdventure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Position Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.ItemPositionDefinition#getItem <em>Item</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.ItemPositionDefinition#getXpos <em>Xpos</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.ItemPositionDefinition#getYpos <em>Ypos</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#getItemPositionDefinition()
 * @model
 * @generated
 */
public interface ItemPositionDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Item</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Item</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item</em>' reference.
   * @see #setItem(ItemDefinition)
   * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#getItemPositionDefinition_Item()
   * @model
   * @generated
   */
  ItemDefinition getItem();

  /**
   * Sets the value of the '{@link at.ac.uibk.greatAdventure.greatAdventure.ItemPositionDefinition#getItem <em>Item</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Item</em>' reference.
   * @see #getItem()
   * @generated
   */
  void setItem(ItemDefinition value);

  /**
   * Returns the value of the '<em><b>Xpos</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Xpos</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xpos</em>' attribute.
   * @see #setXpos(int)
   * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#getItemPositionDefinition_Xpos()
   * @model
   * @generated
   */
  int getXpos();

  /**
   * Sets the value of the '{@link at.ac.uibk.greatAdventure.greatAdventure.ItemPositionDefinition#getXpos <em>Xpos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Xpos</em>' attribute.
   * @see #getXpos()
   * @generated
   */
  void setXpos(int value);

  /**
   * Returns the value of the '<em><b>Ypos</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ypos</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ypos</em>' attribute.
   * @see #setYpos(int)
   * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#getItemPositionDefinition_Ypos()
   * @model
   * @generated
   */
  int getYpos();

  /**
   * Sets the value of the '{@link at.ac.uibk.greatAdventure.greatAdventure.ItemPositionDefinition#getYpos <em>Ypos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ypos</em>' attribute.
   * @see #getYpos()
   * @generated
   */
  void setYpos(int value);

} // ItemPositionDefinition
