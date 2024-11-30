package com.example.shootpro.ui.theme

import android.graphics.Bitmap
import android.util.Log
import com.google.mlkit.vision.common.InputImage
import com.google.mlkit.vision.text.TextRecognition
import com.google.mlkit.vision.text.latin.TextRecognizerOptions

class TextRecognizer {

    fun recognizeTextFromImage(image: Bitmap) {
        val inputImage = InputImage.fromBitmap(image, 0)
        val recognizer = TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS)

        recognizer.process(inputImage)
            .addOnSuccessListener { visionText ->
                for (block in visionText.textBlocks) {
                    val blockText = block.text
                    Log.d("TextRecognizer", "Blocco di testo: $blockText")
                }
            }
            .addOnFailureListener { e ->
                Log.e("TextRecognizer", "Errore durante il riconoscimento del testo", e)
            }
    }
}
