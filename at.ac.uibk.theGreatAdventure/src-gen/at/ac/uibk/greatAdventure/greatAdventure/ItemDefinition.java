/**
 */
package at.ac.uibk.greatAdventure.greatAdventure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition#isPickup <em>Pickup</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition#getImg <em>Img</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition#getUses <em>Uses</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#getItemDefinition()
 * @model
 * @generated
 */
public interface ItemDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#getItemDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Pickup</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pickup</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pickup</em>' attribute.
   * @see #setPickup(boolean)
   * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#getItemDefinition_Pickup()
   * @model
   * @generated
   */
  boolean isPickup();

  /**
   * Sets the value of the '{@link at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition#isPickup <em>Pickup</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pickup</em>' attribute.
   * @see #isPickup()
   * @generated
   */
  void setPickup(boolean value);

  /**
   * Returns the value of the '<em><b>Img</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Img</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Img</em>' attribute.
   * @see #setImg(String)
   * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#getItemDefinition_Img()
   * @model
   * @generated
   */
  String getImg();

  /**
   * Sets the value of the '{@link at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition#getImg <em>Img</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Img</em>' attribute.
   * @see #getImg()
   * @generated
   */
  void setImg(String value);

  /**
   * Returns the value of the '<em><b>Uses</b></em>' containment reference list.
   * The list contents are of type {@link at.ac.uibk.greatAdventure.greatAdventure.UseDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uses</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uses</em>' containment reference list.
   * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#getItemDefinition_Uses()
   * @model containment="true"
   * @generated
   */
  EList<UseDefinition> getUses();

} // ItemDefinition
