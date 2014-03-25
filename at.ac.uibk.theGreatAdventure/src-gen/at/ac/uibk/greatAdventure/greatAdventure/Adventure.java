/**
 */
package at.ac.uibk.greatAdventure.greatAdventure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adventure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.Adventure#getTitle <em>Title</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.Adventure#getItemDef <em>Item Def</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.Adventure#getSceneDef <em>Scene Def</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.Adventure#getStartDef <em>Start Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#getAdventure()
 * @model
 * @generated
 */
public interface Adventure extends EObject
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' containment reference.
   * @see #setTitle(AdventureTitle)
   * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#getAdventure_Title()
   * @model containment="true"
   * @generated
   */
  AdventureTitle getTitle();

  /**
   * Sets the value of the '{@link at.ac.uibk.greatAdventure.greatAdventure.Adventure#getTitle <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' containment reference.
   * @see #getTitle()
   * @generated
   */
  void setTitle(AdventureTitle value);

  /**
   * Returns the value of the '<em><b>Item Def</b></em>' containment reference list.
   * The list contents are of type {@link at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Item Def</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item Def</em>' containment reference list.
   * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#getAdventure_ItemDef()
   * @model containment="true"
   * @generated
   */
  EList<ItemDefinition> getItemDef();

  /**
   * Returns the value of the '<em><b>Scene Def</b></em>' containment reference list.
   * The list contents are of type {@link at.ac.uibk.greatAdventure.greatAdventure.SceneDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scene Def</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scene Def</em>' containment reference list.
   * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#getAdventure_SceneDef()
   * @model containment="true"
   * @generated
   */
  EList<SceneDefinition> getSceneDef();

  /**
   * Returns the value of the '<em><b>Start Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start Def</em>' containment reference.
   * @see #setStartDef(StartDefinition)
   * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#getAdventure_StartDef()
   * @model containment="true"
   * @generated
   */
  StartDefinition getStartDef();

  /**
   * Sets the value of the '{@link at.ac.uibk.greatAdventure.greatAdventure.Adventure#getStartDef <em>Start Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start Def</em>' containment reference.
   * @see #getStartDef()
   * @generated
   */
  void setStartDef(StartDefinition value);

} // Adventure
