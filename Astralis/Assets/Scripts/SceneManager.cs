using UnityEngine;
using System.Collections;

public class SceneManager : MonoBehaviour {

    public GameObject titleScreen;
    public GameObject optionsScreen;

    public void NavToOptions() {

        this.titleScreen.SetActive(false);
        this.optionsScreen.SetActive(true);
    }

    public void NavToTitle() {

        this.titleScreen.SetActive(true);
        this.optionsScreen.SetActive(false);
    }

}
