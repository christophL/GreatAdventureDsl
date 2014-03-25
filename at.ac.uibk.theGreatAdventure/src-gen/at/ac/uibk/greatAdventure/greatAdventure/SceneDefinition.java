/**
 */
package at.ac.uibk.greatAdventure.greatAdventure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scene Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.SceneDefinition#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.SceneDefinition#getImg <em>Img</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.SceneDefinition#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#getSceneDefinition()
 * @model
 * @generated
 */
public interface SceneDefinition extends EObject
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
   * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#getSceneDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.ac.uibk.greatAdventure.greatAdventure.SceneDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#getSceneDefinition_Img()
   * @model
   * @generated
   */
  String getImg();

  /**
   * Sets the value of the '{@link at.ac.uibk.greatAdventure.greatAdventure.SceneDefinition#getImg <em>Img</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Img</em>' attribute.
   * @see #getImg()
   * @generated
   */
  void setImg(String value);

  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link at.ac.uibk.greatAdventure.greatAdventure.ItemPositionDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#getSceneDefinition_Items()
   * @model containment="true"
   * @generated
   */
  EList<ItemPositionDefinition> getItems();

} // SceneDefinition
