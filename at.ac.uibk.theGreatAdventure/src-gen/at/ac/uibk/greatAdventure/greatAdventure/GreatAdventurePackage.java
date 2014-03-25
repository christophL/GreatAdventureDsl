/**
 */
package at.ac.uibk.greatAdventure.greatAdventure;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventureFactory
 * @model kind="package"
 * @generated
 */
public interface GreatAdventurePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "greatAdventure";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.at/uibk/greatAdventure/GreatAdventure";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "greatAdventure";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GreatAdventurePackage eINSTANCE = at.ac.uibk.greatAdventure.greatAdventure.impl.GreatAdventurePackageImpl.init();

  /**
   * The meta object id for the '{@link at.ac.uibk.greatAdventure.greatAdventure.impl.AdventureImpl <em>Adventure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.uibk.greatAdventure.greatAdventure.impl.AdventureImpl
   * @see at.ac.uibk.greatAdventure.greatAdventure.impl.GreatAdventurePackageImpl#getAdventure()
   * @generated
   */
  int ADVENTURE = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVENTURE__TITLE = 0;

  /**
   * The feature id for the '<em><b>Item Def</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVENTURE__ITEM_DEF = 1;

  /**
   * The feature id for the '<em><b>Scene Def</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVENTURE__SCENE_DEF = 2;

  /**
   * The feature id for the '<em><b>Start Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVENTURE__START_DEF = 3;

  /**
   * The number of structural features of the '<em>Adventure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVENTURE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.ac.uibk.greatAdventure.greatAdventure.impl.AdventureTitleImpl <em>Adventure Title</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.uibk.greatAdventure.greatAdventure.impl.AdventureTitleImpl
   * @see at.ac.uibk.greatAdventure.greatAdventure.impl.GreatAdventurePackageImpl#getAdventureTitle()
   * @generated
   */
  int ADVENTURE_TITLE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVENTURE_TITLE__NAME = 0;

  /**
   * The number of structural features of the '<em>Adventure Title</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVENTURE_TITLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.ac.uibk.greatAdventure.greatAdventure.impl.ItemDefinitionImpl <em>Item Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.uibk.greatAdventure.greatAdventure.impl.ItemDefinitionImpl
   * @see at.ac.uibk.greatAdventure.greatAdventure.impl.GreatAdventurePackageImpl#getItemDefinition()
   * @generated
   */
  int ITEM_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Pickup</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_DEFINITION__PICKUP = 1;

  /**
   * The feature id for the '<em><b>Img</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_DEFINITION__IMG = 2;

  /**
   * The feature id for the '<em><b>Uses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_DEFINITION__USES = 3;

  /**
   * The number of structural features of the '<em>Item Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_DEFINITION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.ac.uibk.greatAdventure.greatAdventure.impl.UseDefinitionImpl <em>Use Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.uibk.greatAdventure.greatAdventure.impl.UseDefinitionImpl
   * @see at.ac.uibk.greatAdventure.greatAdventure.impl.GreatAdventurePackageImpl#getUseDefinition()
   * @generated
   */
  int USE_DEFINITION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Reqs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_DEFINITION__REQS = 1;

  /**
   * The feature id for the '<em><b>Alt Text</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_DEFINITION__ALT_TEXT = 2;

  /**
   * The feature id for the '<em><b>Adds</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_DEFINITION__ADDS = 3;

  /**
   * The feature id for the '<em><b>Dels</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_DEFINITION__DELS = 4;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_DEFINITION__TEXT = 5;

  /**
   * The feature id for the '<em><b>Follow Scene</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_DEFINITION__FOLLOW_SCENE = 6;

  /**
   * The number of structural features of the '<em>Use Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_DEFINITION_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link at.ac.uibk.greatAdventure.greatAdventure.impl.SceneDefinitionImpl <em>Scene Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.uibk.greatAdventure.greatAdventure.impl.SceneDefinitionImpl
   * @see at.ac.uibk.greatAdventure.greatAdventure.impl.GreatAdventurePackageImpl#getSceneDefinition()
   * @generated
   */
  int SCENE_DEFINITION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENE_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Img</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENE_DEFINITION__IMG = 1;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENE_DEFINITION__ITEMS = 2;

  /**
   * The number of structural features of the '<em>Scene Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENE_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.ac.uibk.greatAdventure.greatAdventure.impl.ItemPositionDefinitionImpl <em>Item Position Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.uibk.greatAdventure.greatAdventure.impl.ItemPositionDefinitionImpl
   * @see at.ac.uibk.greatAdventure.greatAdventure.impl.GreatAdventurePackageImpl#getItemPositionDefinition()
   * @generated
   */
  int ITEM_POSITION_DEFINITION = 5;

  /**
   * The feature id for the '<em><b>Item</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_POSITION_DEFINITION__ITEM = 0;

  /**
   * The feature id for the '<em><b>Xpos</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_POSITION_DEFINITION__XPOS = 1;

  /**
   * The feature id for the '<em><b>Ypos</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_POSITION_DEFINITION__YPOS = 2;

  /**
   * The number of structural features of the '<em>Item Position Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_POSITION_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.ac.uibk.greatAdventure.greatAdventure.impl.StartDefinitionImpl <em>Start Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.uibk.greatAdventure.greatAdventure.impl.StartDefinitionImpl
   * @see at.ac.uibk.greatAdventure.greatAdventure.impl.GreatAdventurePackageImpl#getStartDefinition()
   * @generated
   */
  int START_DEFINITION = 6;

  /**
   * The feature id for the '<em><b>Start Loc</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_DEFINITION__START_LOC = 0;

  /**
   * The feature id for the '<em><b>Start Items</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_DEFINITION__START_ITEMS = 1;

  /**
   * The number of structural features of the '<em>Start Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_DEFINITION_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link at.ac.uibk.greatAdventure.greatAdventure.Adventure <em>Adventure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Adventure</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.Adventure
   * @generated
   */
  EClass getAdventure();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.uibk.greatAdventure.greatAdventure.Adventure#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.Adventure#getTitle()
   * @see #getAdventure()
   * @generated
   */
  EReference getAdventure_Title();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.uibk.greatAdventure.greatAdventure.Adventure#getItemDef <em>Item Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Item Def</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.Adventure#getItemDef()
   * @see #getAdventure()
   * @generated
   */
  EReference getAdventure_ItemDef();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.uibk.greatAdventure.greatAdventure.Adventure#getSceneDef <em>Scene Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Scene Def</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.Adventure#getSceneDef()
   * @see #getAdventure()
   * @generated
   */
  EReference getAdventure_SceneDef();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.uibk.greatAdventure.greatAdventure.Adventure#getStartDef <em>Start Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start Def</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.Adventure#getStartDef()
   * @see #getAdventure()
   * @generated
   */
  EReference getAdventure_StartDef();

  /**
   * Returns the meta object for class '{@link at.ac.uibk.greatAdventure.greatAdventure.AdventureTitle <em>Adventure Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Adventure Title</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.AdventureTitle
   * @generated
   */
  EClass getAdventureTitle();

  /**
   * Returns the meta object for the attribute '{@link at.ac.uibk.greatAdventure.greatAdventure.AdventureTitle#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.AdventureTitle#getName()
   * @see #getAdventureTitle()
   * @generated
   */
  EAttribute getAdventureTitle_Name();

  /**
   * Returns the meta object for class '{@link at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition <em>Item Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item Definition</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition
   * @generated
   */
  EClass getItemDefinition();

  /**
   * Returns the meta object for the attribute '{@link at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition#getName()
   * @see #getItemDefinition()
   * @generated
   */
  EAttribute getItemDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition#isPickup <em>Pickup</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pickup</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition#isPickup()
   * @see #getItemDefinition()
   * @generated
   */
  EAttribute getItemDefinition_Pickup();

  /**
   * Returns the meta object for the attribute '{@link at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition#getImg <em>Img</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Img</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition#getImg()
   * @see #getItemDefinition()
   * @generated
   */
  EAttribute getItemDefinition_Img();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition#getUses <em>Uses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Uses</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition#getUses()
   * @see #getItemDefinition()
   * @generated
   */
  EReference getItemDefinition_Uses();

  /**
   * Returns the meta object for class '{@link at.ac.uibk.greatAdventure.greatAdventure.UseDefinition <em>Use Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Use Definition</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.UseDefinition
   * @generated
   */
  EClass getUseDefinition();

  /**
   * Returns the meta object for the attribute list '{@link at.ac.uibk.greatAdventure.greatAdventure.UseDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.UseDefinition#getName()
   * @see #getUseDefinition()
   * @generated
   */
  EAttribute getUseDefinition_Name();

  /**
   * Returns the meta object for the reference list '{@link at.ac.uibk.greatAdventure.greatAdventure.UseDefinition#getReqs <em>Reqs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Reqs</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.UseDefinition#getReqs()
   * @see #getUseDefinition()
   * @generated
   */
  EReference getUseDefinition_Reqs();

  /**
   * Returns the meta object for the attribute list '{@link at.ac.uibk.greatAdventure.greatAdventure.UseDefinition#getAltText <em>Alt Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Alt Text</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.UseDefinition#getAltText()
   * @see #getUseDefinition()
   * @generated
   */
  EAttribute getUseDefinition_AltText();

  /**
   * Returns the meta object for the reference list '{@link at.ac.uibk.greatAdventure.greatAdventure.UseDefinition#getAdds <em>Adds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Adds</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.UseDefinition#getAdds()
   * @see #getUseDefinition()
   * @generated
   */
  EReference getUseDefinition_Adds();

  /**
   * Returns the meta object for the reference list '{@link at.ac.uibk.greatAdventure.greatAdventure.UseDefinition#getDels <em>Dels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Dels</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.UseDefinition#getDels()
   * @see #getUseDefinition()
   * @generated
   */
  EReference getUseDefinition_Dels();

  /**
   * Returns the meta object for the attribute list '{@link at.ac.uibk.greatAdventure.greatAdventure.UseDefinition#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Text</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.UseDefinition#getText()
   * @see #getUseDefinition()
   * @generated
   */
  EAttribute getUseDefinition_Text();

  /**
   * Returns the meta object for the reference '{@link at.ac.uibk.greatAdventure.greatAdventure.UseDefinition#getFollowScene <em>Follow Scene</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Follow Scene</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.UseDefinition#getFollowScene()
   * @see #getUseDefinition()
   * @generated
   */
  EReference getUseDefinition_FollowScene();

  /**
   * Returns the meta object for class '{@link at.ac.uibk.greatAdventure.greatAdventure.SceneDefinition <em>Scene Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scene Definition</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.SceneDefinition
   * @generated
   */
  EClass getSceneDefinition();

  /**
   * Returns the meta object for the attribute '{@link at.ac.uibk.greatAdventure.greatAdventure.SceneDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.SceneDefinition#getName()
   * @see #getSceneDefinition()
   * @generated
   */
  EAttribute getSceneDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link at.ac.uibk.greatAdventure.greatAdventure.SceneDefinition#getImg <em>Img</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Img</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.SceneDefinition#getImg()
   * @see #getSceneDefinition()
   * @generated
   */
  EAttribute getSceneDefinition_Img();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.uibk.greatAdventure.greatAdventure.SceneDefinition#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.SceneDefinition#getItems()
   * @see #getSceneDefinition()
   * @generated
   */
  EReference getSceneDefinition_Items();

  /**
   * Returns the meta object for class '{@link at.ac.uibk.greatAdventure.greatAdventure.ItemPositionDefinition <em>Item Position Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item Position Definition</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.ItemPositionDefinition
   * @generated
   */
  EClass getItemPositionDefinition();

  /**
   * Returns the meta object for the reference '{@link at.ac.uibk.greatAdventure.greatAdventure.ItemPositionDefinition#getItem <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Item</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.ItemPositionDefinition#getItem()
   * @see #getItemPositionDefinition()
   * @generated
   */
  EReference getItemPositionDefinition_Item();

  /**
   * Returns the meta object for the attribute '{@link at.ac.uibk.greatAdventure.greatAdventure.ItemPositionDefinition#getXpos <em>Xpos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Xpos</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.ItemPositionDefinition#getXpos()
   * @see #getItemPositionDefinition()
   * @generated
   */
  EAttribute getItemPositionDefinition_Xpos();

  /**
   * Returns the meta object for the attribute '{@link at.ac.uibk.greatAdventure.greatAdventure.ItemPositionDefinition#getYpos <em>Ypos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ypos</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.ItemPositionDefinition#getYpos()
   * @see #getItemPositionDefinition()
   * @generated
   */
  EAttribute getItemPositionDefinition_Ypos();

  /**
   * Returns the meta object for class '{@link at.ac.uibk.greatAdventure.greatAdventure.StartDefinition <em>Start Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Start Definition</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.StartDefinition
   * @generated
   */
  EClass getStartDefinition();

  /**
   * Returns the meta object for the reference '{@link at.ac.uibk.greatAdventure.greatAdventure.StartDefinition#getStartLoc <em>Start Loc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Start Loc</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.StartDefinition#getStartLoc()
   * @see #getStartDefinition()
   * @generated
   */
  EReference getStartDefinition_StartLoc();

  /**
   * Returns the meta object for the reference list '{@link at.ac.uibk.greatAdventure.greatAdventure.StartDefinition#getStartItems <em>Start Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Start Items</em>'.
   * @see at.ac.uibk.greatAdventure.greatAdventure.StartDefinition#getStartItems()
   * @see #getStartDefinition()
   * @generated
   */
  EReference getStartDefinition_StartItems();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GreatAdventureFactory getGreatAdventureFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link at.ac.uibk.greatAdventure.greatAdventure.impl.AdventureImpl <em>Adventure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.uibk.greatAdventure.greatAdventure.impl.AdventureImpl
     * @see at.ac.uibk.greatAdventure.greatAdventure.impl.GreatAdventurePackageImpl#getAdventure()
     * @generated
     */
    EClass ADVENTURE = eINSTANCE.getAdventure();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADVENTURE__TITLE = eINSTANCE.getAdventure_Title();

    /**
     * The meta object literal for the '<em><b>Item Def</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADVENTURE__ITEM_DEF = eINSTANCE.getAdventure_ItemDef();

    /**
     * The meta object literal for the '<em><b>Scene Def</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADVENTURE__SCENE_DEF = eINSTANCE.getAdventure_SceneDef();

    /**
     * The meta object literal for the '<em><b>Start Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADVENTURE__START_DEF = eINSTANCE.getAdventure_StartDef();

    /**
     * The meta object literal for the '{@link at.ac.uibk.greatAdventure.greatAdventure.impl.AdventureTitleImpl <em>Adventure Title</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.uibk.greatAdventure.greatAdventure.impl.AdventureTitleImpl
     * @see at.ac.uibk.greatAdventure.greatAdventure.impl.GreatAdventurePackageImpl#getAdventureTitle()
     * @generated
     */
    EClass ADVENTURE_TITLE = eINSTANCE.getAdventureTitle();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADVENTURE_TITLE__NAME = eINSTANCE.getAdventureTitle_Name();

    /**
     * The meta object literal for the '{@link at.ac.uibk.greatAdventure.greatAdventure.impl.ItemDefinitionImpl <em>Item Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.uibk.greatAdventure.greatAdventure.impl.ItemDefinitionImpl
     * @see at.ac.uibk.greatAdventure.greatAdventure.impl.GreatAdventurePackageImpl#getItemDefinition()
     * @generated
     */
    EClass ITEM_DEFINITION = eINSTANCE.getItemDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITEM_DEFINITION__NAME = eINSTANCE.getItemDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Pickup</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITEM_DEFINITION__PICKUP = eINSTANCE.getItemDefinition_Pickup();

    /**
     * The meta object literal for the '<em><b>Img</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITEM_DEFINITION__IMG = eINSTANCE.getItemDefinition_Img();

    /**
     * The meta object literal for the '<em><b>Uses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM_DEFINITION__USES = eINSTANCE.getItemDefinition_Uses();

    /**
     * The meta object literal for the '{@link at.ac.uibk.greatAdventure.greatAdventure.impl.UseDefinitionImpl <em>Use Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.uibk.greatAdventure.greatAdventure.impl.UseDefinitionImpl
     * @see at.ac.uibk.greatAdventure.greatAdventure.impl.GreatAdventurePackageImpl#getUseDefinition()
     * @generated
     */
    EClass USE_DEFINITION = eINSTANCE.getUseDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USE_DEFINITION__NAME = eINSTANCE.getUseDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Reqs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_DEFINITION__REQS = eINSTANCE.getUseDefinition_Reqs();

    /**
     * The meta object literal for the '<em><b>Alt Text</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USE_DEFINITION__ALT_TEXT = eINSTANCE.getUseDefinition_AltText();

    /**
     * The meta object literal for the '<em><b>Adds</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_DEFINITION__ADDS = eINSTANCE.getUseDefinition_Adds();

    /**
     * The meta object literal for the '<em><b>Dels</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_DEFINITION__DELS = eINSTANCE.getUseDefinition_Dels();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USE_DEFINITION__TEXT = eINSTANCE.getUseDefinition_Text();

    /**
     * The meta object literal for the '<em><b>Follow Scene</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_DEFINITION__FOLLOW_SCENE = eINSTANCE.getUseDefinition_FollowScene();

    /**
     * The meta object literal for the '{@link at.ac.uibk.greatAdventure.greatAdventure.impl.SceneDefinitionImpl <em>Scene Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.uibk.greatAdventure.greatAdventure.impl.SceneDefinitionImpl
     * @see at.ac.uibk.greatAdventure.greatAdventure.impl.GreatAdventurePackageImpl#getSceneDefinition()
     * @generated
     */
    EClass SCENE_DEFINITION = eINSTANCE.getSceneDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCENE_DEFINITION__NAME = eINSTANCE.getSceneDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Img</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCENE_DEFINITION__IMG = eINSTANCE.getSceneDefinition_Img();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENE_DEFINITION__ITEMS = eINSTANCE.getSceneDefinition_Items();

    /**
     * The meta object literal for the '{@link at.ac.uibk.greatAdventure.greatAdventure.impl.ItemPositionDefinitionImpl <em>Item Position Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.uibk.greatAdventure.greatAdventure.impl.ItemPositionDefinitionImpl
     * @see at.ac.uibk.greatAdventure.greatAdventure.impl.GreatAdventurePackageImpl#getItemPositionDefinition()
     * @generated
     */
    EClass ITEM_POSITION_DEFINITION = eINSTANCE.getItemPositionDefinition();

    /**
     * The meta object literal for the '<em><b>Item</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM_POSITION_DEFINITION__ITEM = eINSTANCE.getItemPositionDefinition_Item();

    /**
     * The meta object literal for the '<em><b>Xpos</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITEM_POSITION_DEFINITION__XPOS = eINSTANCE.getItemPositionDefinition_Xpos();

    /**
     * The meta object literal for the '<em><b>Ypos</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITEM_POSITION_DEFINITION__YPOS = eINSTANCE.getItemPositionDefinition_Ypos();

    /**
     * The meta object literal for the '{@link at.ac.uibk.greatAdventure.greatAdventure.impl.StartDefinitionImpl <em>Start Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.uibk.greatAdventure.greatAdventure.impl.StartDefinitionImpl
     * @see at.ac.uibk.greatAdventure.greatAdventure.impl.GreatAdventurePackageImpl#getStartDefinition()
     * @generated
     */
    EClass START_DEFINITION = eINSTANCE.getStartDefinition();

    /**
     * The meta object literal for the '<em><b>Start Loc</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference START_DEFINITION__START_LOC = eINSTANCE.getStartDefinition_StartLoc();

    /**
     * The meta object literal for the '<em><b>Start Items</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference START_DEFINITION__START_ITEMS = eINSTANCE.getStartDefinition_StartItems();

  }

} //GreatAdventurePackage
