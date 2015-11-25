package minhaaplicacao.ifpb.edu.br.minhaaplicacaoandroid;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * Created by Rhavy on 24/11/2015.
 */
public class NotificationOnClickListener implements OnClickListener{

    @Override
    public void onClick(View v) {

        Context context = v.getContext();

        int notificationId = 101;

        // Endereço que será aberto.
        Uri uri = Uri.parse("http://www.google.com.br");

        // Criar a Intent para a uri.
        Intent viewIntent = new Intent(Intent.ACTION_VIEW, uri);

        // Intent pendente para envio na Notificação.
        PendingIntent pendingIntent =
                PendingIntent.getActivity(context, 0, viewIntent, 0);

        Uri alarmSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

        Notification notificationBuild = new NotificationCompat.Builder(context)
                .setTicker("Texto do ticker")
                .setSmallIcon(R.drawable.book)
                .setContentTitle("Título")
                .setContentText("Corpo do texto")
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
                .setSound(alarmSound)
                .build();

        // Serviço de notificação.
        NotificationManagerCompat notificationManager =
                NotificationManagerCompat.from(context);

        // Construir a notificação através do NotificationManager.
        notificationManager.notify(notificationId, notificationBuild);
    }
}
