/**
 */
package at.ac.uibk.greatAdventure.greatAdventure.impl;

import at.ac.uibk.greatAdventure.greatAdventure.Adventure;
import at.ac.uibk.greatAdventure.greatAdventure.AdventureTitle;
import at.ac.uibk.greatAdventure.greatAdventure.GreatAdventureFactory;
import at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage;
import at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition;
import at.ac.uibk.greatAdventure.greatAdventure.ItemPositionDefinition;
import at.ac.uibk.greatAdventure.greatAdventure.SceneDefinition;
import at.ac.uibk.greatAdventure.greatAdventure.StartDefinition;
import at.ac.uibk.greatAdventure.greatAdventure.UseDefinition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GreatAdventurePackageImpl extends EPackageImpl implements GreatAdventurePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass adventureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass adventureTitleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass useDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sceneDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemPositionDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass startDefinitionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GreatAdventurePackageImpl()
  {
    super(eNS_URI, GreatAdventureFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link GreatAdventurePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GreatAdventurePackage init()
  {
    if (isInited) return (GreatAdventurePackage)EPackage.Registry.INSTANCE.getEPackage(GreatAdventurePackage.eNS_URI);

    // Obtain or create and register package
    GreatAdventurePackageImpl theGreatAdventurePackage = (GreatAdventurePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GreatAdventurePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GreatAdventurePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theGreatAdventurePackage.createPackageContents();

    // Initialize created meta-data
    theGreatAdventurePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGreatAdventurePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GreatAdventurePackage.eNS_URI, theGreatAdventurePackage);
    return theGreatAdventurePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdventure()
  {
    return adventureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdventure_Title()
  {
    return (EReference)adventureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdventure_ItemDef()
  {
    return (EReference)adventureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdventure_SceneDef()
  {
    return (EReference)adventureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdventure_StartDef()
  {
    return (EReference)adventureEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdventureTitle()
  {
    return adventureTitleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdventureTitle_Name()
  {
    return (EAttribute)adventureTitleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItemDefinition()
  {
    return itemDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItemDefinition_Name()
  {
    return (EAttribute)itemDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItemDefinition_Pickup()
  {
    return (EAttribute)itemDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItemDefinition_Img()
  {
    return (EAttribute)itemDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItemDefinition_Uses()
  {
    return (EReference)itemDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUseDefinition()
  {
    return useDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUseDefinition_Name()
  {
    return (EAttribute)useDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUseDefinition_Reqs()
  {
    return (EReference)useDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUseDefinition_AltText()
  {
    return (EAttribute)useDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUseDefinition_Adds()
  {
    return (EReference)useDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUseDefinition_Dels()
  {
    return (EReference)useDefinitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUseDefinition_Text()
  {
    return (EAttribute)useDefinitionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUseDefinition_FollowScene()
  {
    return (EReference)useDefinitionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSceneDefinition()
  {
    return sceneDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSceneDefinition_Name()
  {
    return (EAttribute)sceneDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSceneDefinition_Img()
  {
    return (EAttribute)sceneDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSceneDefinition_Items()
  {
    return (EReference)sceneDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItemPositionDefinition()
  {
    return itemPositionDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItemPositionDefinition_Item()
  {
    return (EReference)itemPositionDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItemPositionDefinition_Xpos()
  {
    return (EAttribute)itemPositionDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItemPositionDefinition_Ypos()
  {
    return (EAttribute)itemPositionDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStartDefinition()
  {
    return startDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStartDefinition_StartLoc()
  {
    return (EReference)startDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStartDefinition_StartItems()
  {
    return (EReference)startDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GreatAdventureFactory getGreatAdventureFactory()
  {
    return (GreatAdventureFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    adventureEClass = createEClass(ADVENTURE);
    createEReference(adventureEClass, ADVENTURE__TITLE);
    createEReference(adventureEClass, ADVENTURE__ITEM_DEF);
    createEReference(adventureEClass, ADVENTURE__SCENE_DEF);
    createEReference(adventureEClass, ADVENTURE__START_DEF);

    adventureTitleEClass = createEClass(ADVENTURE_TITLE);
    createEAttribute(adventureTitleEClass, ADVENTURE_TITLE__NAME);

    itemDefinitionEClass = createEClass(ITEM_DEFINITION);
    createEAttribute(itemDefinitionEClass, ITEM_DEFINITION__NAME);
    createEAttribute(itemDefinitionEClass, ITEM_DEFINITION__PICKUP);
    createEAttribute(itemDefinitionEClass, ITEM_DEFINITION__IMG);
    createEReference(itemDefinitionEClass, ITEM_DEFINITION__USES);

    useDefinitionEClass = createEClass(USE_DEFINITION);
    createEAttribute(useDefinitionEClass, USE_DEFINITION__NAME);
    createEReference(useDefinitionEClass, USE_DEFINITION__REQS);
    createEAttribute(useDefinitionEClass, USE_DEFINITION__ALT_TEXT);
    createEReference(useDefinitionEClass, USE_DEFINITION__ADDS);
    createEReference(useDefinitionEClass, USE_DEFINITION__DELS);
    createEAttribute(useDefinitionEClass, USE_DEFINITION__TEXT);
    createEReference(useDefinitionEClass, USE_DEFINITION__FOLLOW_SCENE);

    sceneDefinitionEClass = createEClass(SCENE_DEFINITION);
    createEAttribute(sceneDefinitionEClass, SCENE_DEFINITION__NAME);
    createEAttribute(sceneDefinitionEClass, SCENE_DEFINITION__IMG);
    createEReference(sceneDefinitionEClass, SCENE_DEFINITION__ITEMS);

    itemPositionDefinitionEClass = createEClass(ITEM_POSITION_DEFINITION);
    createEReference(itemPositionDefinitionEClass, ITEM_POSITION_DEFINITION__ITEM);
    createEAttribute(itemPositionDefinitionEClass, ITEM_POSITION_DEFINITION__XPOS);
    createEAttribute(itemPositionDefinitionEClass, ITEM_POSITION_DEFINITION__YPOS);

    startDefinitionEClass = createEClass(START_DEFINITION);
    createEReference(startDefinitionEClass, START_DEFINITION__START_LOC);
    createEReference(startDefinitionEClass, START_DEFINITION__START_ITEMS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(adventureEClass, Adventure.class, "Adventure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAdventure_Title(), this.getAdventureTitle(), null, "title", null, 0, 1, Adventure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAdventure_ItemDef(), this.getItemDefinition(), null, "itemDef", null, 0, -1, Adventure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAdventure_SceneDef(), this.getSceneDefinition(), null, "sceneDef", null, 0, -1, Adventure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAdventure_StartDef(), this.getStartDefinition(), null, "startDef", null, 0, 1, Adventure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(adventureTitleEClass, AdventureTitle.class, "AdventureTitle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAdventureTitle_Name(), ecorePackage.getEString(), "name", null, 0, 1, AdventureTitle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(itemDefinitionEClass, ItemDefinition.class, "ItemDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getItemDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, ItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getItemDefinition_Pickup(), ecorePackage.getEBoolean(), "pickup", null, 0, 1, ItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getItemDefinition_Img(), ecorePackage.getEString(), "img", null, 0, 1, ItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getItemDefinition_Uses(), this.getUseDefinition(), null, "uses", null, 0, -1, ItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(useDefinitionEClass, UseDefinition.class, "UseDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUseDefinition_Name(), ecorePackage.getEString(), "name", null, 0, -1, UseDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUseDefinition_Reqs(), this.getItemDefinition(), null, "reqs", null, 0, -1, UseDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUseDefinition_AltText(), ecorePackage.getEString(), "altText", null, 0, -1, UseDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUseDefinition_Adds(), this.getItemDefinition(), null, "adds", null, 0, -1, UseDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUseDefinition_Dels(), this.getItemDefinition(), null, "dels", null, 0, -1, UseDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUseDefinition_Text(), ecorePackage.getEString(), "text", null, 0, -1, UseDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUseDefinition_FollowScene(), this.getSceneDefinition(), null, "followScene", null, 0, 1, UseDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sceneDefinitionEClass, SceneDefinition.class, "SceneDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSceneDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, SceneDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSceneDefinition_Img(), ecorePackage.getEString(), "img", null, 0, 1, SceneDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSceneDefinition_Items(), this.getItemPositionDefinition(), null, "items", null, 0, -1, SceneDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(itemPositionDefinitionEClass, ItemPositionDefinition.class, "ItemPositionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getItemPositionDefinition_Item(), this.getItemDefinition(), null, "item", null, 0, 1, ItemPositionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getItemPositionDefinition_Xpos(), ecorePackage.getEInt(), "xpos", null, 0, 1, ItemPositionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getItemPositionDefinition_Ypos(), ecorePackage.getEInt(), "ypos", null, 0, 1, ItemPositionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(startDefinitionEClass, StartDefinition.class, "StartDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStartDefinition_StartLoc(), this.getSceneDefinition(), null, "startLoc", null, 0, 1, StartDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStartDefinition_StartItems(), this.getItemDefinition(), null, "startItems", null, 0, -1, StartDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //GreatAdventurePackageImpl
